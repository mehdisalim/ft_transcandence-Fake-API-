package com.salim.FakeAPI.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.salim.FakeAPI.DTO.RequestDTO.ConversationsRequestDTO;
import com.salim.FakeAPI.DTO.RequestDTO.UserRequestDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.ConversationsResponseDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.StatsResponseDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.UserResponseDTO;
import com.salim.FakeAPI.persistence.entity.Stats;
import com.salim.FakeAPI.persistence.entity.User;
import com.salim.FakeAPI.persistence.entity.chat.Conversations;

public class Convertor {

    public static UserResponseDTO convertUserToUserResponseDTO(final User user) {
        return UserResponseDTO.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .userName(user.getUserName())
                .active(user.isActive())
                .birthday(user.getBirthday())
                .phone(user.getPhone())
                .cover(user.getCover())
                .email(user.getEmail())
                .friend(user.isFriend())
                .gender(user.getGender())
                .joinDate(user.getJoinDate())
                .profileImage(user.getProfileImage())
                .build();
    }
    
    public static User convertUserRequestDTOToUser(final UserRequestDTO user) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ms");

        String formattedDate = myDateObj.format(myFormatObj);
        return User.builder()
                .fullName(user.getFullName())
                .userName(user.getUserName())
                .active(user.isActive())
                .birthday(user.getBirthday())
                .phone(user.getPhone())
                .cover(user.getCover())
                .email(user.getEmail())
                .friend(user.isFriend())
                .gender(user.getGender())
                .joinDate(formattedDate)
                .profileImage(user.getProfileImage())
                .build();
    }

    public static StatsResponseDTO convertStatsToStatsResponseDTO(final Stats stats) {
        return StatsResponseDTO.builder().id(stats.getId()).league(stats.getLeague()).loss(stats.getLoss())
                .nextLeague(stats.getNextLeague()).progressBar(stats.getProgressBar()).rank(stats.getRank())
                .userId(stats.getUserId()).win(stats.getWin()).build();
    }



    public static ConversationsResponseDTO convertConversationToConversationsResponseDTO(Conversations conv) {
        return ConversationsResponseDTO.builder()
                        .id(conv.getId())
                        .message(conv.getMessage())
                        .receiverId(conv.getReceiverId())
                        .senderId(conv.getSenderId())
                        .time(conv.getTime())
                        .build();
    }
    
    public static Conversations convertConversationsRequestDTOToConversations(ConversationsRequestDTO conv) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ms");

        String formattedDate = myDateObj.format(myFormatObj);
        
        return Conversations.builder()
                        .message(conv.getMessage())
                        .receiverId(conv.getReceiverId())
                        .senderId(conv.getSenderId())
                        .time(formattedDate)
                        .build();
    }
}
