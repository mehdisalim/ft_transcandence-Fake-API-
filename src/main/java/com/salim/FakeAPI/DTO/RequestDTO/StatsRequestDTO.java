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
public class StatsRequestDTO {
    
    Long userId;
    long win;
    long loss;

    int rank;
    String league;
    String nextLeague;
    int progressBar;
    // List<GraphStats> graph;

}
