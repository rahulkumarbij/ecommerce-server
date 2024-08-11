package com.zosh.ecommerce_youtube.com.zosh.repository;

import com.zosh.ecommerce_youtube.com.zosh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);
}
