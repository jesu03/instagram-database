package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NewsFeeds {
    @Id
    private String id;
    private int newsfeed;
    private LocalDate newslastmodify;
    public NewsFeeds() {
    }
    public NewsFeeds(String id, int newsfeed, LocalDate newslastmodify) {
        this.id = id;
        this.newsfeed = newsfeed;
        this.newslastmodify = newslastmodify;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getNewsfeed() {
        return newsfeed;
    }
    public void setNewsfeed(int newsfeed) {
        this.newsfeed = newsfeed;
    }
    public LocalDate getNewslastmodify() {
        return newslastmodify;
    }
    public void setNewslastmodify(LocalDate newslastmodify) {
        this.newslastmodify = newslastmodify;
    }
    
}
