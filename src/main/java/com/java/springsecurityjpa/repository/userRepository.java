package com.java.springsecurityjpa.repository;

import com.java.springsecurityjpa.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;


//method, jpa provides implmn automatically,
public interface userRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);

}
