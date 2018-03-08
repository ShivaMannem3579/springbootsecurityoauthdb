package com.security.example.springbootsecurityoauth.repo;

import com.security.example.springbootsecurityoauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
     Optional<User> findByName(String userName);
}
