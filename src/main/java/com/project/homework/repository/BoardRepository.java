package com.project.homework.repository;

import com.project.homework.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
