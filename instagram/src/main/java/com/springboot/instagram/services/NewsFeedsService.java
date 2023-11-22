package com.springboot.instagram.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.instagram.repository.NewsFeedsRepository;

@Service
public class NewsFeedsService implements NewsFeedsRepository{

    @Autowired
    private NewsFeedsRepository newsFeedsRepository; 
    
}
