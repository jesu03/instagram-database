package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Userspl {
    @Id
    private String usersplid;
    private Integer followinglist;
    @OneToOne
    private NewsFeeds newsfeeds;
    private LocalDate lastmodified;
    private LocalDate newslastfeedid;
    public Userspl() {
    }
    public Userspl(String usersplid, Integer followinglist, NewsFeeds newsfeeds, LocalDate lastmodified,
            LocalDate newslastfeedid) {
        this.usersplid = usersplid;
        this.followinglist = followinglist;
        this.newsfeeds = newsfeeds;
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
    public NewsFeeds getNewsfeeds() {
        return newsfeeds;
    }
    public void setNewsfeeds(NewsFeeds newsfeeds) {
        this.newsfeeds = newsfeeds;
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
