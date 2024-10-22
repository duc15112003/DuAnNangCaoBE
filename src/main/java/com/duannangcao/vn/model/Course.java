package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-incrementing ID
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private String status;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "createAt")
    private LocalDateTime createAt;

    @Column(name = "updateAt")
    private LocalDateTime updateAt;

    @Column(name = "deleteAt")
    private LocalDateTime deleteAt;
}
