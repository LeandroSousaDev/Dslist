package com.leandross.dslist.dto;

public record GameDTO(Integer id,
                      String title,
                      Integer year,
                      String genre,
                      String platforms,
                      Double score,
                      String imgUrl,
                      String shortDescription,
                      String longDescription) {
}
