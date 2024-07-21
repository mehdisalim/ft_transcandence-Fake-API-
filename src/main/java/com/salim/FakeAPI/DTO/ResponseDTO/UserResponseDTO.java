package com.salim.FakeAPI.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDTO {
    Long id;
    String fullName;
    String userName;
    String email;
    String phone;
    String gender;
    String birthday;
    String joinDate;
    boolean active;
    boolean friend;
    String profileImage;
    String cover;

    StatsResponseDTO stats;

}
