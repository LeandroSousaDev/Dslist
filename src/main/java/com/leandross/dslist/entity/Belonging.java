package com.leandross.dslist.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_belonging")
@Data
public class Belonging {

    @EmbeddedId
    private BelongingPK id;

    @ManyToOne
    @MapsId("game")
    @JoinColumn(name = "Game_id")
    private Game game;

    @ManyToOne
    @MapsId("gameList")
    @JoinColumn(name = "List_id")
    private GameList gameList;

    private Integer position;

    public Belonging() {
    }

    public Belonging(BelongingPK id, Game game, GameList gameList, Integer position) {
        this.id = id;
        this.game = game;
        this.gameList = gameList;
        this.position = position;
    }
}
