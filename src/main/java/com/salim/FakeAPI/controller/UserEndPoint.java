package com.salim.FakeAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.DTO.RequestDTO.UserRequestDTO;
import com.salim.FakeAPI.DTO.ResponseDTO.UserResponseDTO;
import com.salim.FakeAPI.persistence.entity.Stats;
import com.salim.FakeAPI.persistence.entity.User;
import com.salim.FakeAPI.service.StatsService;
import com.salim.FakeAPI.service.UserService;
import com.salim.FakeAPI.utils.Convertor;

import jakarta.persistence.Convert;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserEndPoint {

    private final UserService userService;
    private final StatsService statsService;

    @GetMapping("all")
    public List<UserResponseDTO> getProfileInfos() {
        return userService.getAllUsers().stream().map(user -> {
            UserResponseDTO response = Convertor.convertUserToUserResponseDTO(user);
            Optional<Stats> stats = statsService.getStatsByUserId(user.getId());
            if (stats.isPresent())
                response.setStats(Convertor.convertStatsToStatsResponseDTO(stats.get()));
            return response;
        }).toList();
    }

    @GetMapping("{id}")
    public UserResponseDTO getUserById(@PathVariable("id") Long id) {
        User u = userService.getUserById(id).get();
        UserResponseDTO response = Convertor.convertUserToUserResponseDTO(u);
        Optional<Stats> stats = statsService.getStatsByUserId(u.getId());
        if (stats.isPresent())
            response.setStats(Convertor.convertStatsToStatsResponseDTO(stats.get()));
        return response;
    }

    @PostMapping("adduser")
    public String addUser(@RequestBody UserRequestDTO user) {
        return userService.addUser(Convertor.convertUserRequestDTOToUser(user)) ? "the use was added succesfully." : "error ";
    }
    
    @PostMapping("addusers")
    public String addUsers(@RequestBody List<UserRequestDTO> users) {
        int size = userService.addUsers(users.stream().map(Convertor::convertUserRequestDTOToUser).toList()).size();
        return size != 0 ? "the use was added succesfully. size = " + size : "error ";
    }

    @DeleteMapping("deleteall")
    public void deleteAll() {
        userService.deleteAll();
    }

}
