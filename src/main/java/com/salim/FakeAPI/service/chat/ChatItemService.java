package com.salim.FakeAPI.service.chat;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salim.FakeAPI.persistence.entity.chat.ChatItem;
import com.salim.FakeAPI.persistence.repository.chat.ChatItemRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatItemService {

    private final ChatItemRepository repo;

    public List<ChatItem> getAllChatItems() {
        return repo.findAll();
    }

    public List<ChatItem> getChatItemsById(Long id) {
        return repo.findByUserId(id);
    }
    
    public Optional<ChatItem> getChatItemByTaregetId(Long userId, Long targetId) {
        return repo.findByUserIdAndTargetId(userId, targetId);
    }
    
    public ChatItem addItem(ChatItem item) {
        return repo.save(item);
    }

}
