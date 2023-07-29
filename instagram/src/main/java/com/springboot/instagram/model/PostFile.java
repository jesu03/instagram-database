package com.springboot.instagram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostFile {
    @Id
    private String postid;
    private String postname;
    private String posttype;
    private String thumbnail;
    public PostFile(String postid, String postname, String posttype, String thumbnail) {
        this.postid = postid;
        this.postname = postname;
        this.posttype = posttype;
        this.thumbnail = thumbnail;
    }
    public PostFile() {
    }
    public String getPostid() {
        return postid;
    }
    public void setPostid(String postid) {
        this.postid = postid;
    }
    public String getPostname() {
        return postname;
    }
    public void setPostname(String postname) {
        this.postname = postname;
    }
    public String getPosttype() {
        return posttype;
    }
    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    

}
