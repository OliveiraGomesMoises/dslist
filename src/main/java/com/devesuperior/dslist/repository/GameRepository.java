package com.devesuperior.dslist.repository;

import com.devesuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {
}
