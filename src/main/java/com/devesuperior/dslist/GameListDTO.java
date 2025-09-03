package com.devesuperior.dslist;

import com.devesuperior.dslist.entities.GameList;

import java.util.List;
import java.util.stream.Collectors;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public static List<GameListDTO> converte(List<GameList> result) {
        return result.stream().map(GameListDTO::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
