package com.shakil.repository;

import com.shakil.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository  extends JpaRepository<Player, Long> {

}
