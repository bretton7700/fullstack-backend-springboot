package com.springbootrefresher.fullstack.repository;

import com.springbootrefresher.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
