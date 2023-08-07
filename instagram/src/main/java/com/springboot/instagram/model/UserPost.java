package com.springboot.instagram.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class UserPost {
    @Id
    private String userpostid;
     private String caption;
     private LocalDate createdat;
     @OneToOne 
     private PostFile postFile;
    public UserPost(String userpostid, String caption, LocalDate createdat, PostFile postFile) {
        this.userpostid = userpostid;
        this.caption = caption;
        this.createdat = createdat;
        this.postFile = postFile;
    }
    
    public UserPost() {
    }

    public String getUserpostid() {
        return userpostid;
    }
    public void setUserpostid(String userpostid) {
        this.userpostid = userpostid;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public LocalDate getCreatedat() {
        return createdat;
    }
    public void setCreatedat(LocalDate createdat) {
        this.createdat = createdat;
    }
    public PostFile getPostFile() {
        return postFile;
    }
    public void setPostFile(PostFile postFile) {
        this.postFile = postFile;
    }
     
}
