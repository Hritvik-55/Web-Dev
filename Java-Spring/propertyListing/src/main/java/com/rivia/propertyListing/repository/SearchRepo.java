package com.rivia.propertyListing.repository;

import com.rivia.propertyListing.model.Post;

import java.util.List;

public interface SearchRepo {
    List<Post> findByText(String text);
}
