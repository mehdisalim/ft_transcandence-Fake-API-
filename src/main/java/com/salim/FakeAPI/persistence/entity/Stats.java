package com.salim.FakeAPI.persistence.entity;

import java.util.List;

import com.salim.FakeAPI.model.GraphStats;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stats")
public class Stats {
    
    public Stats(Long userId, long win, long loss, int rank, String league, String nextLeague, int progressBar) {
        this.userId = userId;
        this.win = win;
        this.loss = loss;
        this.rank = rank;
        this.league = league;
        this.nextLeague = nextLeague;
        this.progressBar = progressBar;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    
    @Column(unique = true, nullable = false)
    Long userId;

    long win;
    long loss;

    @Column(name = "user_rank")
    int rank;
    String league;
    String nextLeague;
    int progressBar;
    // List<GraphStats> graph;
}
