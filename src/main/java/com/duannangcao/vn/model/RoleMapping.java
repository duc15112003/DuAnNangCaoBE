package com.duannangcao.vn.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_mapping")
public class RoleMapping {

    @Id
    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id_role")
    private Role role;
}

