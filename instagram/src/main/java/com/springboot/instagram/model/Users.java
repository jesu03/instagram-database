package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
    private String usersid;
    private String userid;
    private String newsfeedid;
    private int[] followinglist;
    private LocalDate lastmodified;
    public Users(String usersid, String userid, String newsfeedid, int[] followinglist, LocalDate lastmodified) {
        this.usersid = usersid;
        this.userid = userid;
        this.newsfeedid = newsfeedid;
        this.followinglist = followinglist;
        this.lastmodified = lastmodified;
    }
    public Users() {
    }
    public String getUsersid() {
        return usersid;
    }
    public void setUsersid(String usersid) {
        this.usersid = usersid;
    }
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getNewsfeedid() {
        return newsfeedid;
    }
    public void setNewsfeedid(String newsfeedid) {
        this.newsfeedid = newsfeedid;
    }
    public int[] getFollowinglist() {
        return followinglist;
    }
    public void setFollowinglist(int[] followinglist) {
        this.followinglist = followinglist;
    }
    public LocalDate getLastmodified() {
        return lastmodified;
    }
    public void setLastmodified(LocalDate lastmodified) {
        this.lastmodified = lastmodified;
    }
    
    
}
