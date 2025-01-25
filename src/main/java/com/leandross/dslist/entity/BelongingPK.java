package com.leandross.dslist.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class BelongingPK {

    private Integer game;

    private Integer gameList;

    public BelongingPK() {
    }

    public BelongingPK(Integer game, Integer gameList) {
        this.game = game;
        this.gameList = gameList;
    }
}
