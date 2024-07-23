package com.salim.FakeAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salim.FakeAPI.persistence.entity.User;
import com.salim.FakeAPI.persistence.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepo;


    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    public boolean addUser(final User user) {
        return userRepo.save(user) != null;
    }

    public List<User> addUsers(final List<User> users) {
        return userRepo.saveAllAndFlush(users);
    }

    public void deleteAll() {
        userRepo.deleteAll();
    }
}
