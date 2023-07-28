package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserBio {
    @Id
    private String userbioid;
    @OneToOne
    private User user;
    private String profileimgname;
    private String text;
    private String gender;
    private String websiteurl;
    private LocalDate createdat;
    public UserBio(String userbioid, User user, String profileimgname, String text, String gender, String websiteurl,
            LocalDate createdat) {
        this.userbioid = userbioid;
        this.user = user;
        this.profileimgname = profileimgname;
        this.text = text;
        this.gender = gender;
        this.websiteurl = websiteurl;
        this.createdat = createdat;
    }
    public UserBio() {
    }
    public String getUserbioid() {
        return userbioid;
    }
    public void setUserbioid(String userbioid) {
        this.userbioid = userbioid;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getProfileimgname() {
        return profileimgname;
    }
    public void setProfileimgname(String profileimgname) {
        this.profileimgname = profileimgname;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getWebsiteurl() {
        return websiteurl;
    }
    public void setWebsiteurl(String websiteurl) {
        this.websiteurl = websiteurl;
    }
    public LocalDate getCreatedat() {
        return createdat;
    }
    public void setCreatedat(LocalDate createdat) {
        this.createdat = createdat;
    }
    
    
}
