package com.springboot.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.model.Userspl;
import com.springboot.instagram.repository.UsersplRepository;

@RestController
@RequestMapping("api/userspl")
public class UsersplController {
    @Autowired
    private UsersplRepository usersplRepository;

    @PostMapping("/post")
    public List<Userspl> persist(@RequestBody Userspl userspl){
            usersplRepository.save(userspl);
            return usersplRepository.findAll();
    }
    
    @GetMapping("/get")
    public List<Userspl> getAll(){
            return usersplRepository.findAll();
    }
}
