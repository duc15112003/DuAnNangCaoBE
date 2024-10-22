package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "lesson_cmt")
public class LessonCmt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @ManyToOne
    @JoinColumn(name = "id_lesson", referencedColumnName = "id", nullable = false)
    private Lesson lesson;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;

    @Column(name = "like")
    private Integer like;
}
