package com.salim.FakeAPI.DTO.RequestDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConversationsRequestDTO {
    Long senderId;
    Long receiverId;
    String message;
}
