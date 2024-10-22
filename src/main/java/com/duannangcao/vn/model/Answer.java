package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_quiz", referencedColumnName = "id_quiz")
    private Quiz quiz;

    @Column(name = "answer1")
    private String answer1;

    @Column(name = "answer2")
    private String answer2;

    @Column(name = "answer3")
    private String answer3;

    @Column(name = "answer4")
    private String answer4;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "explain")
    private String explain;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
