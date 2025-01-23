package com.leandross.dslist.dto;

import com.leandross.dslist.entity.Game;
import lombok.Getter;

@Getter
public class GameMinDTO {
    private Integer id;
    private String title;
    private Integer year;
    private String imgUrl;
    private  String shortDescription;

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
