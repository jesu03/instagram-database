package com.springboot.instagram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.instagram.model.NewsFeeds;

public interface NewsFeedsRepository extends JpaRepository<NewsFeeds,String>{
    
}
