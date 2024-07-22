package com.salim.FakeAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salim.FakeAPI.DTO.RequestDTO.ConversationsRequestDTO;
import com.salim.FakeAPI.persistence.entity.Conversations;
import com.salim.FakeAPI.persistence.repository.ConversationsRepository;
import com.salim.FakeAPI.utils.Convertor;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ConversationsService {

    private final ConversationsRepository repo;

    public List<Conversations> getAllConversations() {
        return repo.findAll();
    }

    public List<Conversations> getConversationsBySenderIdAndReceiverId(Long senderId, Long receiverId) {
        return repo.findAllBySenderIdAndReceiverId(senderId, receiverId);
    }

    public Conversations addConversationToTable(ConversationsRequestDTO conv) {
        return repo.save(Convertor.convertConversationsRequestDTOToConversations(conv));
    }
}
