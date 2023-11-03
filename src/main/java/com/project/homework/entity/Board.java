package com.project.homework.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "board")
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Board {
    @Id
    @Column(name = "board_key", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardKey;

    @Column(name = "board_title", nullable = false)
    private String boardTitle;

    @Column(name = "board_content", nullable = false)
    private String boardContent;

    @Column(name = "board_by", nullable = false)
    private Integer boardBy;

    @Column(name = "board_view", nullable = false)
    private Integer boardView = 0;

    @Column(name = "board_file_path", nullable = true)
    private String boardFilePath;

}