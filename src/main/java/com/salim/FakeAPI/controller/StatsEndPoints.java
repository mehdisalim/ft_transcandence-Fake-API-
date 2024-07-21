package com.salim.FakeAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salim.FakeAPI.DTO.ResponseDTO.StatsResponseDTO;
import com.salim.FakeAPI.persistence.entity.Stats;
import com.salim.FakeAPI.service.StatsService;
import com.salim.FakeAPI.utils.Convertor;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/stats")
@Slf4j
public class StatsEndPoints {

    private final StatsService statsService;

    @GetMapping("all")
    public List<StatsResponseDTO> getAllStats() {
        return statsService.getAllStats().stream().map(Convertor::convertStatsToStatsResponseDTO).toList();
    }

    @GetMapping("{id}")
    public StatsResponseDTO getStatsById(@PathVariable("id") Long id) {
        return Convertor.convertStatsToStatsResponseDTO(statsService.getStatsById(id).get());
    }

    @GetMapping("userid={id}")
    public StatsResponseDTO getStatsByUserId(@PathVariable("id") Long id) {
        return Convertor.convertStatsToStatsResponseDTO(statsService.getStatsByUserId(id).get());
    }

    @PostMapping("addstats")
    public String addStats(@RequestBody Stats stats) {
        log.warn(stats.toString());
        return statsService.addStats(stats) ? "the use was added succesfully." : "error ";
    }

}
