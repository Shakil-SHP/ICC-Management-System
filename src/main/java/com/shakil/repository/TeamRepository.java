package com.shakil.repository;

import com.shakil.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
//    List<Team> TeamList();
//    Team addTeam(Team team);
//    Team getTeamByTeamName(String teamName);
//    Team getTeamByTeamId(Long TeamId);
//    Team updateTeam(Team team);
}
