package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "name_topic", nullable = false)
    private String nameTopic;

    @Column(name = "total_lessons")
    private Integer totalLessons;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "description")
    private String description;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
