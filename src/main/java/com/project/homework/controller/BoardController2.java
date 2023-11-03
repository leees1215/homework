package com.project.homework.controller;

import com.project.homework.entity.Board;
import com.project.homework.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController2 {
    private final BoardService boardService;

    @RequestMapping("/boardPage")
    public String findAllboard(Model model) {
        List<Board> boardList = boardService.findAllBoard();
        model.addAttribute("list3", boardList);
        return "Board.html";
    }
}
