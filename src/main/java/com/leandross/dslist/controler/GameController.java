package com.leandross.dslist.controler;

import com.leandross.dslist.dto.GameDTO;
import com.leandross.dslist.dto.GameMinDTO;
import com.leandross.dslist.dto.GameMinDTO2;
import com.leandross.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    ResponseEntity<List<GameMinDTO>> findAll() {
        var result = this.gameService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping("/{id}")
    ResponseEntity<GameDTO> findById(@PathVariable("id") String id) {
        var result = this.gameService.findById(Integer.valueOf(id));
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
