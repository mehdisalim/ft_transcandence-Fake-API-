package com.salim.FakeAPI.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salim.FakeAPI.persistence.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
