package com.leandross.dslist.dto;

import java.util.List;

public record GameListBelongingDTO(
        Integer id,
        String name,
        List<GameMinDTO> games) {
}
