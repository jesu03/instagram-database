package com.springboot.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.springboot.instagram.model.UserPost;
import com.springboot.instagram.services.UserPostService;

@RestController
@RequestMapping("/api/userposts")
public class UserPostController {
    @Autowired
    private UserPostService userPostService;
    
    @PostMapping("/post")
    public List<UserPost> persist(@RequestBody UserPost userPost){
        userPostService.save(userPost);
        return userPostService.findAll();
    }
    @GetMapping(value="/")
    public List<UserPost> getAll(){
        return userPostService.findAll();
    }
    @GetMapping(value="/{userpostid}")
    public UserPost get(@RequestParam("userpostid") String userpostid){
        return userPostService.findById(userpostid).get();
    }
    @PutMapping(value="/put/{userpostid}")
    public List<UserPost> put(@PathVariable String userpostid,@RequestBody UserPost userPost){
            if(userPostService.existsById(userpostid)){
                userPostService.deleteById(userpostid);
                userPostService.save(userPost);
            }
            return userPostService.findAll();
    }
    @DeleteMapping(value="/delete/{userpostid}")
    public List<UserPost> delete(@PathVariable String userpostid){
        userPostService.deleteById(userpostid);
        return userPostService.findAll();
    }

}
