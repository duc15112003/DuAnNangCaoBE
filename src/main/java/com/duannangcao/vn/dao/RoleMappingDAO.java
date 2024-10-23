package com.duannangcao.vn.dao;

import com.duannangcao.vn.model.RoleMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleMappingDAO extends JpaRepository<RoleMapping, Integer> {
    @Query("select r from RoleMapping r where r.user.username =?1")
    List<RoleMapping> findByUsername(String username);
}
