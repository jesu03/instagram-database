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
import com.springboot.instagram.services.NewsFeedsService;

@RestController
@RequestMapping("/api/newsfeeds")
public class NewsFeedsController {

    @AutoWired
    private NewsFeedsService newsFeedsService;

    @PostMapping("/post")
    public List<NewsFeeds> persist(@RequestBody NewsFeeds newsfeeds){
        newsFeedsService.save(newsfeeds);
        return newsFeedsService.findAll();
    }
    @GetMapping("/get")
    public List<NewsFeeds> getAll(){
        return newsFeedsService.findAll();
    }
    @PutMapping("/put")
    public List<NewsFeeds> put(@PathVariable String id,@RequestBody NewsFeeds newsfeeds){
         if(newsFeedsService.existsById(id)){
            newsFeedsService.deleteById(id);
            newsFeedsService.save(newsfeeds);
         }
         return newsFeedsService.findAll();
    }
    @DeleteMapping("/delete")
    public List<NewsFeeds> delete(@PathVariable String id){
            if(newsFeedsService.existsById(id)){
                newsFeedsService.deleteById(id);
            }
            return newsFeedsService.findAll();
    }
}
