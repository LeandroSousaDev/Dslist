package com.leandross.dslist.repository;

import com.leandross.dslist.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Integer> {
}
