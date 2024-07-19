package com.salim.FakeAPI.Models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {
    long win;
    long loss;
    int rank;
    String league;
    String nextLeague;
    int progressBar;
    List<GraphStats> graph;
}
