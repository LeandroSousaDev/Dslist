package com.leandross.dslist.controler;

import com.leandross.dslist.dto.GameListDTO;
import com.leandross.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    ResponseEntity<List<GameListDTO>> findAll() {
        var result = this.gameListService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
