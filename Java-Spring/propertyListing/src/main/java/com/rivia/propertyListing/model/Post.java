package com.rivia.propertyListing.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "listingsAndReviews")
public class Post {
    private String listing_url;
    private String name;
    private String summary;
    private String description;
    private Integer bedrooms;
    private String amenities[];

    public String getListing_url() {
        return listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }
}
