package com.salim.FakeAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.controller.interfaces.ICommonEndPoints;
import com.salim.FakeAPI.persistence.entity.chat.ChatItem;
import com.salim.FakeAPI.service.chat.ChatItemService;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("api/v1/chat")
@RequiredArgsConstructor
public class ChatItemEndPoints implements ICommonEndPoints<ChatItem>{
    
    private final ChatItemService service;

    @GetMapping("all")
    @Override
    public List<ChatItem> getAllData() {
        return service.getAllData();
    }

    @GetMapping("{id}")
    @Override
    public ChatItem getDataById(@PathVariable("id") Long id) {
        return service.getDataById(id).get();
    }

    @PostMapping("additem")
    @Override
    public ChatItem insertData(@RequestBody ChatItem data) {
        return service.insertData(data);
    }

    // @DeleteMapping("")
    @Override
    public void deleteAll() {
        service.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        service.deleteById(id);
    }
}
