package com.salim.FakeAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.DTO.RequestDTO.ConversationsRequestDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.ConversationsResponseDTO;
import com.salim.FakeAPI.service.ConversationsService;
import com.salim.FakeAPI.utils.Convertor;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/conversations")
public class ConversartionsEndPoints {

    private final ConversationsService service;

    @GetMapping("/all")
    public List<ConversationsResponseDTO> getAllConversations() {
        System.out.println("time is : " + Calendar.getInstance().getTime().toString());
        return service.getAllConversations().stream().map(Convertor::convertConversationToConversationsResponseDTO).toList();
    }
    
    @GetMapping("sender={senderId}&receiver={receiverId}")
    public List<ConversationsResponseDTO> getConversationsBySenderIdAndReceiverId(@PathVariable("senderId") Long senderId, @PathVariable("receiverId") Long receiverId) {
        return service.getConversationsBySenderIdAndReceiverId(senderId, receiverId).stream().map(Convertor::convertConversationToConversationsResponseDTO).toList();
    }
    

    @PostMapping("addconversation")
    public ConversationsResponseDTO addConversationToTable(@RequestBody ConversationsRequestDTO body) {
        return Convertor.convertConversationToConversationsResponseDTO(service.addConversationToTable(body));
    }

}
