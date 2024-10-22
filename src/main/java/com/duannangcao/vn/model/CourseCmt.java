package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "course_cmt")
public class CourseCmt {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "like")
    private Integer like;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
