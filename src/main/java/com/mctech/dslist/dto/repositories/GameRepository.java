package com.mctech.dslist.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mctech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
