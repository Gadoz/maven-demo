package com.marcotechnology.baac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcotechnology.baac.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
