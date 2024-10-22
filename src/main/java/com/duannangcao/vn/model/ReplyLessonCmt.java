package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reply_lesson_comment")
public class ReplyLessonCmt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_comment_lesson", referencedColumnName = "id", nullable = false)
    private LessonCmt lessonCmt;

    @Column(name = "from", nullable = false)
    private String fromUser;

    @Column(name = "to", nullable = false)
    private String toUser;

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
