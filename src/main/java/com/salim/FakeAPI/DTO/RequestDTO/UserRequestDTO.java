package com.salim.FakeAPI.DTO.RequestDTO;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
public class UserRequestDTO {
    
    String fullName;

    String userName;

    String email;

    String phone;

    String gender;

    String birthday;

    boolean active;
    boolean friend;

    String profileImage;
    String cover;

    
    StatsRequestDTO stats;
    // List<Links> links;

    // List<Achievements> achievements;
}
