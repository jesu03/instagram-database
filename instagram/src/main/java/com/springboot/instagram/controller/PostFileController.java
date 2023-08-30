package com.springboot.instagram.controller;

import java.util.List;
import java.util.Optional;

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

import com.springboot.instagram.model.PostFile;
import com.springboot.instagram.repository.PostFileRepository;

@RestController
@RequestMapping("/api/postfiles")
public class PostFileController {
       @Autowired
       private PostFileRepository postFileRepository;
       
       @PostMapping("/post")
       public List<PostFile> perisist(@RequestBody PostFile postFile){
        postFileRepository.save(postFile);
        return postFileRepository.findAll();
       }
       @GetMapping(value="/getall")
       public List<PostFile> getAll(){
        return postFileRepository.findAll();
       }

       @GetMapping(value="/get/{postid}")
       public Optional<PostFile> get(@RequestParam("postid") String postid){
        return postFileRepository.findById(postid);
       }
       
       @PutMapping(value="/put/{postid}")
       public List<PostFile> put(@PathVariable String postid,@RequestBody PostFile postFile){
            if(postFileRepository.existsById(postid)){
                postFileRepository.deleteById(postid);
                postFileRepository.save(postFile);
            }
            return postFileRepository.findAll();
       }

       @DeleteMapping(value="/delete/{postid}")
       public List<PostFile> delete(@PathVariable String postid){
             postFileRepository.deleteById(postid);
             return postFileRepository.findAll();
       }

}
