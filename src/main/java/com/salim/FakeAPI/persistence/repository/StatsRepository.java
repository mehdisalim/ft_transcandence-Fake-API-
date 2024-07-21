package com.salim.FakeAPI.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salim.FakeAPI.persistence.entity.Stats;

public interface StatsRepository extends JpaRepository<Stats, Long> {
    
    public Optional<Stats> findByUserId(Long userId);

}
