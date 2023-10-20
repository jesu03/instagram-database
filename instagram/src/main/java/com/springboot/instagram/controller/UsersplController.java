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

    @PutMapping("/put/{usersplid}")
    public List<Userspl> update(@PathVariable String usersplid,@RequestBody Userspl userspl){
          if(usersplRepository.existsById(usersplid)){
                usersplRepository.deleteById(usersplid);
                usersplRepository.save(userspl);
          }
          return usersplRepository.findAll();
    }

    @DeleteMapping("/delete/{usersplid}")
    public List<Userspl> delete(@PathVariable String usersplid){
            if(usersplRepository.existsById(usersplid)){
                  usersplRepository.deleteById(usersplid);
            }
            return usersplRepository.findAll();
    }
    
}
