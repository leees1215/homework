package com.project.homework.controller;

import com.project.homework.entity.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.homework.service.BoardService;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "Board")

public class BoardController {

    private final BoardService boardService;

    @GetMapping("/{id}")
    public Board selectBoard(@PathVariable("id") Integer id) {
        return boardService.selectBoardById(id);
    }

}
