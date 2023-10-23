package com.springboot.instagram.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.instagram.model.NewsFeeds;
import com.springboot.instagram.repository.NewsFeedsRepository;

@RestController
@RequestMapping("/api/newsfeeds")
public class NewsFeedsController {

    @AutoWired
    private NewsFeedsRepository newsFeedsRepository;

    @PostMapping("/post")
    public List<NewsFeeds> persist(@RequestBody NewsFeeds newsfeeds){
        newsFeedsRepository.save(newsfeeds);
        return newsFeedsRepository.findAll();
    }
    @GetMapping("/get")
    public List<NewsFeeds> getAll(){
        return newsFeedsRepository.findAll();
    }
    @PutMapping("/put")
    public List<NewsFeeds> put(@PathVariable String id,@RequestBody NewsFeeds newsfeeds){
         if(newsFeedsRepository.existsById(id)){
            newsFeedsRepository.deleteById(id);
            newsFeedsRepository.save(newsfeeds);
         }
         return newsFeedsRepository.findAll();
    }
    @DeleteMapping("/delete")
    public List<NewsFeeds> delete(@PathVariable String id){
            if(newsFeedsRepository.existsById(id)){
                newsFeedsRepository.deleteById(id);
            }
            return newsFeedsRepository.findAll();
    }
}
