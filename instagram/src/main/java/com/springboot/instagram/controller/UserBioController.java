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
import com.springboot.instagram.repository.UserBioRepository;

@RestController
@RequestMapping("/api/userbios")
public class UserBioController {
    @Autowired
    private UserBioRepository userBioRepository;

    @GetMapping(value="/")
    public List<UserBio> getAll(){
        return userBioRepository.findAll();
    }

    @PostMapping(value="/")
    public List<UserBio> persist(@RequestBody UserBio userBio){
         userBioRepository.save(userBio);
         return userBioRepository.findAll();
    }
    
    @GetMapping(value="/{userbioid}")
    public UserBio get(@RequestParam("userbioid") String userbioid){
        return userBioRepository.findById(userbioid).get();
    }
    @PutMapping(value="/{userbioid}")
    public List<UserBio> put(@PathVariable String userbioid,@RequestBody UserBio userbio){
        if(userBioRepository.existsById(userbioid)){
            userBioRepository.deleteById(userbioid);
            userBioRepository.save(userbio);
        }
        return userBioRepository.findAll();
    }
    @DeleteMapping(value="/{userbioid}")
    public List<UserBio> delete(@PathVariable String userbioid){
         userBioRepository.deleteById(userbioid);
         return userBioRepository.findAll();
    }
    
}
