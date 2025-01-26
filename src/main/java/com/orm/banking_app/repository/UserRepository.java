package com.orm.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orm.banking_app.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);
}
