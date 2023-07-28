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

import com.springboot.instagram.model.UserRelation;
import com.springboot.instagram.repository.UserRelationRepository;

@RestController
@RequestMapping("/api/userrelations")
public class UserRelationController {
    @Autowired
    private UserRelationRepository userRelationRepository;

    @GetMapping(value="/")
    public List<UserRelation> getAll(){
        return userRelationRepository.findAll();
    }

    @PostMapping(value="/")
    public List<UserRelation> persist(@RequestBody UserRelation userRelation) {
         userRelationRepository.save(userRelation);
         return userRelationRepository.findAll();
    }
    
    @GetMapping(value={"/userrelationid"})
    public UserRelation get(@RequestParam("userrelationid") String userrelationid){
        return userRelationRepository.findById(userrelationid).get();
    }
    @PutMapping(value={"/userrelationid"})
    public List<UserRelation> put(@PathVariable String userrelationid ,@RequestBody UserRelation userRelation){
        if(userRelationRepository.existsById(userrelationid)){
            userRelationRepository.deleteById(userrelationid);
             userRelationRepository.save(userRelation);
        }
        return userRelationRepository.findAll();
    }
    @DeleteMapping(value="/{userrelationid}")
    public List<UserRelation> delete(@PathVariable String userrelationid){
        userRelationRepository.deleteById(userrelationid);
        return userRelationRepository.findAll();
    }
}
