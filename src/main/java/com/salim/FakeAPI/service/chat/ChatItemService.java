package com.salim.FakeAPI.service.chat;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salim.FakeAPI.persistence.entity.chat.ChatItem;
import com.salim.FakeAPI.persistence.repository.chat.ChatItemRepository;
import com.salim.FakeAPI.service.interfaces.ICommonServices;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ChatItemService implements ICommonServices<ChatItem> {

    private final ChatItemRepository repo;

    @Override
    public List<ChatItem> getAllData() {
        return repo.findAll();
    }

    @Override
    public Optional<ChatItem> getDataById(Long id) {
        return repo.findById(id);
    }

    @Override
    public ChatItem insertData(ChatItem data) {
        return repo.save(data);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }


}
