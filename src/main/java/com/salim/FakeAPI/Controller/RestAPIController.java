package com.salim.FakeAPI.Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.Models.Achievements;
import com.salim.FakeAPI.Models.GraphStats;
import com.salim.FakeAPI.Models.Links;
import com.salim.FakeAPI.Models.Stats;
import com.salim.FakeAPI.Models.User;

@RestController
public class RestAPIController {
    
    @CrossOrigin
    @GetMapping("/api/v1/profile")
    public List<User> getProfileInfos() {


        List<GraphStats> graph = new ArrayList<GraphStats>();
        graph.add(new GraphStats("win", 89));
        graph.add(new GraphStats("loss", 11));
        Stats stats = new Stats(89, 11, 204, "GOLD", "LEGANDARY", 89, graph);
        List<Links> links = new ArrayList<Links>();
        links.add(new  Links("google", "https://www.google.com/search/"));
        links.add(new  Links("youtube", "https://www.youtube.com/search/"));

        List<Achievements> achievements = new ArrayList<Achievements>();
        achievements.add(new Achievements("Gold", "./images/svg-header/profile.jpeg"));
        achievements.add(new Achievements("Platinum", "./images/svg-header/profile.jpeg"));

        
        List<User> users = new ArrayList<User>();

        User u = new User(
            1, 
            "mehdidasadsads salim", 
            "Esaldasfasdim", 
            "emailafsdfas", 
            "+2126ewew12345678", 
            "MALfffffE", 
            "dsfsffsdsfasd", 
            "dsdasdfasdf", 
            true, 
            true, 
            "./images/svg-header/profile.jpeg", 
            "/frontend/images/xxxxxx.png", 
            stats, 
            links, 
            achievements
        );

        users.add(u);

        return users;
    } 

}
