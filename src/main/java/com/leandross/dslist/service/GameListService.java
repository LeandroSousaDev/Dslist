package com.leandross.dslist.service;

import com.leandross.dslist.dto.GameListBelongingDTO;
import com.leandross.dslist.dto.GameListDTO;
import com.leandross.dslist.dto.GameMinDTO;
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
        return result.stream().map(x -> new GameListDTO(x.getId(), x.getName())).toList();
    }

    public GameListBelongingDTO findById(Integer id) {
        var result = this.gameListRepository.findById(id).get();

        var orderedList = result.getBelongings()
                .stream()
                .sorted((o1, o2) -> o1.getPosition().compareTo(o2.getPosition())).toList();

        return new GameListBelongingDTO(
                result.getId(),
                result.getName(),
                orderedList.stream().map(x -> new GameMinDTO(
                        x.getGame().getId(),
                        x.getGame().getTitle(),
                        x.getGame().getYear(),
                        x.getGame().getImgUrl(),
                        x.getGame().getShortDescription())).toList());
    }

}
