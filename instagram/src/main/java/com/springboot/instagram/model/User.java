package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private String userid;
    private String username;
    private String email;
    private String password;
    private LocalDate createdat;
    
    public User(String userid, String username, String email, String password, LocalDate createdat) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createdat = createdat;
    }
    
    public User() {
    }

    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getCreatedat() {
        return createdat;
    }
    public void setCreatedat(LocalDate createdat) {
        this.createdat = createdat;
    }
   
    
}
