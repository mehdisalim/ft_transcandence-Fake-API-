package com.salim.FakeAPI.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    long id;

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
    Stats stats;
    List<Links> links;

    List<Achievements> achievements;


}
