package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @Column(name = "id_quiz", nullable = false)
    private Long idQuiz;

    @ManyToOne
    @JoinColumn(name = "id_lesson", referencedColumnName = "id_lesson")
    private Lesson lesson;

    @Column(name = "name", nullable = false)
    private String name;
}
