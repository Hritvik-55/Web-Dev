package com.rivia.propertyListing.repository;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.rivia.propertyListing.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;
import org.bson.Document;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class SearchRepoImpl implements SearchRepo{
    @Autowired
    MongoClient client;
    @Autowired
    MongoConverter converter;

    @Override
    public List<Post> findByText(String text) {

        final List<Post> posts=new ArrayList<>();
        MongoDatabase database = client.getDatabase("sample_airbnb");
        MongoCollection<org.bson.Document> collection = database.getCollection("listingsAndReviews");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text", new Document("query", text).append("path", Arrays.asList("name", "description", "summary", "notes")))),
                new Document("$sort",
                        new Document("number_of_reviews", -1L)),
                new Document("$limit", 5L)));
        result.forEach(document -> posts.add(converter.read(Post.class,document)));
        return posts;
    }
}
