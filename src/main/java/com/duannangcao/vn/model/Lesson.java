package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_topic", referencedColumnName = "id")
    private Topic topic;

    @Column(name = "name_lesson", nullable = false)
    private String nameLesson;

    @Column(name = "link")
    private String link;

    @Column(name = "progress")
    private Integer progress;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;
}
