package com.salim.FakeAPI.persistence.repository.chat;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.salim.FakeAPI.persistence.entity.chat.ChatItem;

@Repository
public interface ChatItemRepository extends JpaRepository<ChatItem, Long> {

    Optional<ChatItem> findByUserIdAndTargetId(Long userId, Long targetId);

    List<ChatItem> findByUserId(Long id);

}
