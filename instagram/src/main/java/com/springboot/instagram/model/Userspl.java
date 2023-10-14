package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Userspl {
    @Id
    private String usersplid;
    private Integer followinglist;
    private Integer newsfeedid;
    private LocalDate lastmodified;
    private LocalDate newslastfeedid;
    public Userspl() {
    }
    public Userspl(String usersplid, Integer followinglist, Integer newsfeedid, LocalDate lastmodified,
            LocalDate newslastfeedid) {
        this.usersplid = usersplid;
        this.followinglist = followinglist;
        this.newsfeedid = newsfeedid;
        this.lastmodified = lastmodified;
        this.newslastfeedid = newslastfeedid;
    }
    public String getUsersplid() {
        return usersplid;
    }
    public void setUsersplid(String usersplid) {
        this.usersplid = usersplid;
    }
    public Integer getFollowinglist() {
        return followinglist;
    }
    public void setFollowinglist(Integer followinglist) {
        this.followinglist = followinglist;
    }
    public Integer getNewsfeedid() {
        return newsfeedid;
    }
    public void setNewsfeedid(Integer newsfeedid) {
        this.newsfeedid = newsfeedid;
    }
    public LocalDate getLastmodified() {
        return lastmodified;
    }
    public void setLastmodified(LocalDate lastmodified) {
        this.lastmodified = lastmodified;
    }
    public LocalDate getNewslastfeedid() {
        return newslastfeedid;
    }
    public void setNewslastfeedid(LocalDate newslastfeedid) {
        this.newslastfeedid = newslastfeedid;
    }
    
}
