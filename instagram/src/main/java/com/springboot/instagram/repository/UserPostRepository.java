package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.instagram.model.UserPost;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost,String>{
            public UserPost updateId(){
                
            }
}
