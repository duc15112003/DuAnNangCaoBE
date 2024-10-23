package com.duannangcao.vn.dao;

import com.duannangcao.vn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
    User findByUsername(String username);
}
