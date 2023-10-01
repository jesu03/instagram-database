package com.springboot.instagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.model.Users;
import com.springboot.instagram.repository.UsersRepository;

@RestController
@RequestMapping("api/users")
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;

    @PostMapping(value ="/posts")
    public List<Users> persist(@RequestBody Users users){
            usersRepository.save(users);
            return usersRepository.findAll();
    }

    @GetMapping(value = "/getsall")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }

}
