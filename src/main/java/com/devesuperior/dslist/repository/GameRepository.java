package com.devesuperior.dslist.repository;

import com.devesuperior.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Games, Long> {
}
