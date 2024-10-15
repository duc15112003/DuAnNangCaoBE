package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "voucher")
public class Voucher {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "create_at")
    private LocalDateTime createAt;
}

