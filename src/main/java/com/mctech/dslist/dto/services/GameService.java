package com.mctech.dslist.dto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mctech.dslist.dto.repositories.GameRepository;
import com.mctech.dslist.entities.Game;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	
	}
		
}
