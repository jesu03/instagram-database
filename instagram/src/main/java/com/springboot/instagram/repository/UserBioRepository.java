package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.instagram.model.UserBio;

@Repository
public interface UserBioRepository extends JpaRepository<UserBio,String>{
    
}
