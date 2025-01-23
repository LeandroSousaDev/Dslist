package com.leandross.dslist.dto;

import com.leandross.dslist.entity.GameList;
import lombok.Getter;

@Getter
public class GameListDTO {

    private Integer id;
    private String name;

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
