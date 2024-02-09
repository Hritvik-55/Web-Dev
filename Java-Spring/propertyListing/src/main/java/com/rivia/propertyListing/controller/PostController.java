package com.rivia.propertyListing.controller;

import javax.servlet.http.HttpServletResponse;

import com.rivia.propertyListing.model.Post;
import com.rivia.propertyListing.repository.PostRepo;
import com.rivia.propertyListing.repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
    @Autowired
    PostRepo repo;
    @Autowired
    SearchRepo srepo;
    @GetMapping("/posts")
    @CrossOrigin
    public List<Post> getAllPosts(){
        return repo.findAll();

    }

    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);

    }
    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }



}
