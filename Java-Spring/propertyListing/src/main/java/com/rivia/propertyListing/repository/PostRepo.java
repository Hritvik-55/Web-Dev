package com.rivia.propertyListing.repository;

import com.rivia.propertyListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {


}
