package io.javabrains.moviecatalogservice.models;

import java.util.List;

public class MovieRating {

    public  MovieRating(){

    }
    private List<Rating>ratingList;

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
