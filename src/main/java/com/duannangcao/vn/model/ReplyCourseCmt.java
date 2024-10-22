package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "reply_course_cmt")
public class ReplyCourseCmt {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_course_lesson", referencedColumnName = "id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "from", referencedColumnName = "username")
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "to", referencedColumnName = "username")
    private User toUser;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "like")
    private Integer like;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
