package com.leandross.dslist.dto;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.leandross.dslist.entity.Game;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }
}
