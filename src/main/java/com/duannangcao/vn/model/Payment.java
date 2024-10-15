package com.duannangcao.vn.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_voucher", referencedColumnName = "id")
    private Voucher voucher;

    @Column(name = "paid", nullable = false)
    private Double paid;

    @Column(name = "datetime")
    private LocalDateTime datetime;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "update_at")
    private LocalDateTime updateAt;

    @Column(name = "delete_at")
    private LocalDateTime deleteAt;

    @Column(name = "status")
    private Boolean status;
}

