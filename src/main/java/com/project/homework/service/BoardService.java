package com.project.homework.service;

import com.project.homework.entity.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.project.homework.repository.BoardRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Board selectBoardById(Integer id) {
        return boardRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Board> findAllBoard() {
        return boardRepository.findAll();
    }
}
