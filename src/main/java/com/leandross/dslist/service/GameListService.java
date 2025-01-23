package com.leandross.dslist.service;

import com.leandross.dslist.dto.GameListDTO;
import com.leandross.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        var result = this.gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}
