package com.salim.FakeAPI.persistence.entity.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chat_list")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatList {
    @Id
    Long id;

    Long userId;
    Long targetId;
    int numberOfMessage;
    String lastMessage;
    String time;
    
}
