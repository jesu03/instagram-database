package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.instagram.model.UserRelation;

@Repository
public interface UserRelationRepository extends JpaRepository<UserRelation,String>{
    
}
