package com.salim.FakeAPI.utils;

import com.salim.FakeAPI.DTO.ResponseDTO.StatsResponseDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.UserResponseDTO;
import com.salim.FakeAPI.persistence.entity.Stats;
import com.salim.FakeAPI.persistence.entity.User;

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

    public static StatsResponseDTO convertStatsToStatsResponseDTO(final Stats stats) {
        return StatsResponseDTO.builder().id(stats.getId()).league(stats.getLeague()).loss(stats.getLoss())
                .nextLeague(stats.getNextLeague()).progressBar(stats.getProgressBar()).rank(stats.getRank())
                .userId(stats.getUserId()).win(stats.getWin()).build();
    }
}
