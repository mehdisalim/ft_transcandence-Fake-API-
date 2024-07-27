package com.salim.FakeAPI.persistence.entity.chat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
public class ChatItem {
    @Id
    @SequenceGenerator(name = "chat_list_seq", sequenceName = "chat_list_seq", allocationSize = 1)
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    Long id;

    Long userId;
    Long targetId;
    int numberOfMessage;
    String lastMessage;
    String time;
    
    public ChatItem(Long userId, Long targetId, int numberOfMessage, String lastMessage, String time) {
        this.userId = userId;
        this.targetId = targetId;
        this.numberOfMessage = numberOfMessage;
        this.lastMessage = lastMessage;
        this.time = time;
    }
    
}


// {
//     id: 9,
//     userId: 1,
//     targetUserId: 3,
//     lastMessage: "hello test ...",
//     time: "12:08 PM",
//     numberOfMessage: 12
// }