package com.leandross.dslist.service;

import com.leandross.dslist.dto.GameDTO;
import com.leandross.dslist.dto.GameMinDTO;
import com.leandross.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = this.gameRepository.findAll();

        return result.stream()
                .map(x -> new GameMinDTO(
                        x.getId(),
                        x.getTitle(),
                        x.getYear(),
                        x.getImgUrl(),
                        x.getShortDescription()))
                .toList();
    }

    public GameDTO findById(Integer id) {
        var result = this.gameRepository.findById(id).get();

        return new GameDTO(
                result.getId(),
                result.getTitle(),
                result.getYear(),
                result.getGenre(),
                result.getPlatforms(),
                result.getScore(),
                result.getImgUrl(),
                result.getShortDescription(),
                result.getLongDescription());
    }
}
