package com.leandross.dslist.dto;

import com.leandross.dslist.entity.Game;
import lombok.Getter;

@Getter
public class GameMinDTO {
    private final Integer id;
    private final String title;
    private final Integer year;
    private final String imgUrl;
    private final String shortDescription;

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
