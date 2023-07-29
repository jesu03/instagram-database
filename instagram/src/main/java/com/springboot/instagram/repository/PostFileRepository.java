package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.instagram.model.PostFile;

@Repository
public interface PostFileRepository extends JpaRepository<PostFile,String>{
        
}
