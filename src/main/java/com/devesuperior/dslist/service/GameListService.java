package com.devesuperior.dslist.service;

import com.devesuperior.dslist.GameListDTO;
import com.devesuperior.dslist.entities.GameList;
import com.devesuperior.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return GameListDTO.converte(result);
    }
}
