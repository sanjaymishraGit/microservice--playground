package io.javabrains.ratingdataservice.resources;

import io.javabrains.ratingdataservice.models.MovieRating;
import io.javabrains.ratingdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class ratingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){

        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public MovieRating getAllRatedMovie(@PathVariable ("userId") String userId){

        List<Rating> ratings = Arrays.asList(
                new Rating("1234",4),
                new Rating("5678",3)
        );

        MovieRating movieRating = new MovieRating();
        movieRating.setRatingList(ratings);
        return movieRating;

    }

}
