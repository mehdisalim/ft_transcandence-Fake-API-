package com.salim.FakeAPI.persistence.repository.chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.salim.FakeAPI.persistence.entity.chat.ChatItem;

@Repository
public interface ChatItemRepository extends JpaRepository<ChatItem, Long> {

}
