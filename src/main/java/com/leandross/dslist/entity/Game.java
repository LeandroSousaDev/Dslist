package com.leandross.dslist.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;


@Entity
@Table(name = "tb_game")
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column (name = "game_year")
    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private  String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {
    }

    public Game(Integer id,
                Integer year,
                String genre,
                String platforms,
                Double score,
                String imgUrl,
                String shortDescription,
                String longDescription) {
        this.id = id;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
