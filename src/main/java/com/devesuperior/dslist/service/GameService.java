package com.devesuperior.dslist.service;

import com.devesuperior.dslist.dto.GameDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.entities.Game;
import com.devesuperior.dslist.projections.GameMinProjection;
import com.devesuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return GameMinDTO.converte(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
}
}
