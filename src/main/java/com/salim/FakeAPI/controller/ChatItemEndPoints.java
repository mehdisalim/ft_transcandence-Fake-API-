package com.salim.FakeAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.persistence.entity.chat.ChatItem;
import com.salim.FakeAPI.service.chat.ChatItemService;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RestController
@RequestMapping("api/v1/chat")
@RequiredArgsConstructor
public class ChatItemEndPoints {
    
    private final ChatItemService service;

    @GetMapping("all")
    public List<ChatItem> getAllChatItems() {
        return service.getAllChatItems();
    }

    @GetMapping("{id}")
    public List<ChatItem> getChatItemsById(@PathVariable("id") Long id) {
        return service.getChatItemsById(id);
    }
    
    @GetMapping("user={userid}&target={targetid}")
    public ChatItem getChatItemByTaregetId(@PathVariable("userid") Long userid, @PathVariable("targetid") Long targetid) {
        return service.getChatItemByTaregetId(userid, targetid).get();
    }


    @PostMapping("/additem")
    public ChatItem addItem(@RequestBody ChatItem item) {
        return service.addItem(item);
    }


}
