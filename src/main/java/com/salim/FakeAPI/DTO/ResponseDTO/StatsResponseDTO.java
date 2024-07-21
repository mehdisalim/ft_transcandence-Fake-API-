package com.salim.FakeAPI.DTO.ResponseDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatsResponseDTO {
    Long id;
    Long userId;
    long win;
    long loss;

    int rank;
    String league;
    String nextLeague;
    int progressBar;
    // List<GraphStats> graph;
}
