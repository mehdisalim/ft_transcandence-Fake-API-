package com.salim.FakeAPI.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Builder
public class User {
    
    public User(String fullName, String userName, String email, String phone, String gender, String birthday,
    String joinDate, boolean active, boolean friend, String profileImage, String cover) {
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.birthday = birthday;
        this.joinDate = joinDate;
        this.active = active;
        this.friend = friend;
        this.profileImage = profileImage;
        this.cover = cover;
    }
    
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
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

    
    // Stats stats;
    // List<Links> links;

    // List<Achievements> achievements;


}
