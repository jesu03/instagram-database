package com.springboot.instagram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRelation {
    @Id
    private String userrelationid;
    @ManyToOne
    private User user;
    private String folowersid;
    public UserRelation(String userrelationid, User user, String folowersid) {
        this.userrelationid = userrelationid;
        this.user = user;
        this.folowersid = folowersid;
    }
    public UserRelation() {
    }
    public String getUserrelationid() {
        return userrelationid;
    }
    public void setUserrelationid(String userrelationid) {
        this.userrelationid = userrelationid;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getFolowersid() {
        return folowersid;
    }
    public void setFolowersid(String folowersid) {
        this.folowersid = folowersid;
    }
    
       
}
