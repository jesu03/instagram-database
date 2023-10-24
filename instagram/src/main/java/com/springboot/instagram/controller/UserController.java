package com.springboot.instagram.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.model.User;
import com.springboot.instagram.services.UserService;


@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController{

    @Autowired
    private UserService userService;
    
    @GetMapping(value="/")
    public List<User> getAll(){
        return userService.findAll();
    }

    @PostMapping("/post")
    public List<User> persist(@RequestBody User user){
        userService.save(user);
         return userService.findAll();
    }
    

    @GetMapping(value="/{userid}")
    public User get(@RequestParam("userid") String userid){
            return userService.findById(userid).get();
    }

    @PutMapping(value="/{userid}")
    public List<User> put(@PathVariable String userid,@RequestBody User user){
        if(userService.existsById(userid)){
            userService.deleteById(userid);
            userService.save(user);
        }
        return userService.findAll();
    }

    @DeleteMapping(value="/{userid}")
    public List<User> delete(@PathVariable String userid){
        userService.deleteById(userid);
        return userService.findAll();
    }
 
}
