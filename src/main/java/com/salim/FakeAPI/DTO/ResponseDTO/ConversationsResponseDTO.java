package com.salim.FakeAPI.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConversationsResponseDTO {
    Long id;
    Long senderId;
    Long receiverId;
    String message;
    String time;

}
