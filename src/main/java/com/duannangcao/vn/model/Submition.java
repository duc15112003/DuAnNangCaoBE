package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "submition")
public class Submition {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_lesson", referencedColumnName = "id_lesson")
    private Lesson lesson;

    @Column(name = "answer")
    private String answer;

    @Column(name = "total_point")
    private Double totalPoint;

    @Column(name = "point")
    private Double point;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
