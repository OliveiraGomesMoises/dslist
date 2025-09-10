package com.devesuperior.dslist.controller;

import com.devesuperior.dslist.GameListDTO;
import com.devesuperior.dslist.ReposicionamentoDTO;
import com.devesuperior.dslist.dto.GameMinDTO;
import com.devesuperior.dslist.service.GameListService;
import com.devesuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
    @PostMapping (value = "/{listId}/reposicionamento")
    public void move(@PathVariable Long listId, @RequestBody ReposicionamentoDTO body){
        gameListService.move(listId,body.getSourceIndex(), body.getDestinationIndex());
    }
}
