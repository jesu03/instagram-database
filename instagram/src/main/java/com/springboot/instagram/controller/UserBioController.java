package com.springboot.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.model.UserBio;
import com.springboot.instagram.services.UserBioService;

@RestController
@RequestMapping("/api/userbios")
public class UserBioController {
    @Autowired
    private UserBioService userBioService;

    @GetMapping(value="/getall")
    public List<UserBio> getAll(){
        return userBioService.findAll();
    }

    @PostMapping("/post")
    public List<UserBio> persist(@RequestBody UserBio userBio){
        userBioService.save(userBio);
         return userBioService.findAll();
    }
    
    @GetMapping(value="/get/{userbioid}")
    public UserBio get(@RequestParam("userbioid") String userbioid){
        return userBioService.findById(userbioid).get();
    }
    @PutMapping(value="/put/{userbioid}")
    public List<UserBio> put(@PathVariable String userbioid,@RequestBody UserBio userbio){
        if(userBioService.existsById(userbioid)){
            userBioService.deleteById(userbioid);
            userBioService.save(userbio);
        }
        return userBioService.findAll();
    }
    @DeleteMapping(value="/delete/{userbioid}")
    public List<UserBio> delete(@PathVariable String userbioid){
         userBioService.deleteById(userbioid);
         return userBioService.findAll();
    }
    
}
