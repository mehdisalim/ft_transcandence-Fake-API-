package com.salim.FakeAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.salim.FakeAPI.persistence.entity.Stats;
import com.salim.FakeAPI.persistence.repository.StatsRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class StatsService {
    
        
    private final StatsRepository statsRepo;


    public List<Stats> getAllStats() {
        return statsRepo.findAll();
    }

    public Optional<Stats> getStatsById(Long id) {
        return statsRepo.findById(id);
    }

    public Optional<Stats> getStatsByUserId(Long id) {
        return statsRepo.findByUserId(id);
    }

    public boolean addStats(final Stats stats) {
        return statsRepo.save(stats) != null;
    }

}
