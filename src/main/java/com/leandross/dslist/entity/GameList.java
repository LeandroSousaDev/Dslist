package com.leandross.dslist.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_game_list")
@Data
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "gameList")
    private List<Belonging> belongings = new ArrayList<>();

    public GameList() {
    }

    public GameList(Integer id, String name, List<Belonging> belongings) {
        this.id = id;
        this.name = name;
        this.belongings = belongings;
    }
}
