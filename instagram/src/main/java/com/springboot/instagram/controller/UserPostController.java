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

import com.springboot.instagram.model.UserPost;
import com.springboot.instagram.repository.UserPostRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/userposts")
public class UserPostController {
    @Autowired
    private UserPostRepository userPostRepository;
    
    @PostMapping(value="/")
    public UserPost persist(@RequestBody UserPost userPost){
        userPostRepository.save(userPost);
        return userPostRepository.findById(userPost.getUserpostid()).get();
    }
    @GetMapping(value="/")
    public List<UserPost> getAll(){
        return userPostRepository.findAll();
    }
    @GetMapping(value="/{userpostid}")
    public UserPost get(@RequestParam("userpostid") String userpostid){
        return userPostRepository.findById(userpostid).get();
    }
    @PutMapping(value="/{userpostid}")
    public List<UserPost> put(@PathVariable String userpostid,@RequestBody UserPost userPost){
            if(userPostRepository.existsById(userpostid)){
                userPostRepository.deleteById(userpostid);
                userPostRepository.save(userPost);
            }
            return userPostRepository.findAll();
    }
    @DeleteMapping(value="/{userpostid}")
    public List<UserPost> delete(@PathVariable String userpostid){
        userPostRepository.deleteById(userpostid);
        return userPostRepository.findAll();
    }

}
