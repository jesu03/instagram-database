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

import com.springboot.instagram.model.User;
import com.springboot.instagram.repository.UserRepository;


@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping(value="/")
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value="/")
    public User persist(@RequestBody User user){
         userRepository.save(user);
         return userRepository.findById(user.getUserid()).get();
    }
    

    @GetMapping(value="/{userid}")
    public User get(@RequestParam("userid") String userid){
            return userRepository.findById(userid).get();
    }

    @PutMapping(value="/{userid}")
    public List<User> put(@PathVariable String userid,@RequestBody User user){
        if(userRepository.existsById(userid)){
            userRepository.deleteById(userid);
            userRepository.save(user);
        }
        return userRepository.findAll();
    }

    @DeleteMapping(value="/{userid}")
    public List<User> delete(@PathVariable String userid){
        userRepository.deleteById(userid);
        return userRepository.findAll();
    }
 
}
