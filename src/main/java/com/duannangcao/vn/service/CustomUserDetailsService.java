package com.duannangcao.vn.service;

import com.duannangcao.vn.dao.RoleMappingDAO;
import com.duannangcao.vn.dao.UserDao;
import com.duannangcao.vn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomUserDetailsService implements UserDetailsService {
   @Autowired
   UserDao userDao;
   @Autowired
    RoleMappingDAO roleMappingDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User account = userDao.findById(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        List<GrantedAuthority> authorities = roleMappingDao.findByUsername(username)
                .stream()
                .map(roleMapping -> new SimpleGrantedAuthority("ROLE_" + roleMapping.getRole().getIdRole())) // Sửa đổi ở đây
                .collect(Collectors.toList());

        return new org.springframework.security.core.userdetails.User(
                account.getUsername(),
                account.getPassword(),
                authorities
        );
    }
}
