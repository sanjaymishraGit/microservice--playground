package io.javabrains.ratingdataservice.models;

import java.util.List;

public class MovieRating {

    private List<Rating>ratingList;

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
