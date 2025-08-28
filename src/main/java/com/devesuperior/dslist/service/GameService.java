package com.devesuperior.dslist.service;

import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Games;
import com.devesuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> finAll(){
       List<Games> result = gameRepository.findAll();
       return GameMinDTO.converte(result);
    }
}
