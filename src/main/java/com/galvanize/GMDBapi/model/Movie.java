package com.galvanize.GMDBapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {
    @Id
    private String title;
    private String director;
    private String actors;
    private String release;
    private String description;
    private String rating;
    @ElementCollection
    private List<Integer> ratings = new ArrayList<>();
    @ElementCollection
    private List<String> reviews = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public List<Integer> getRatings() {

        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }



}
