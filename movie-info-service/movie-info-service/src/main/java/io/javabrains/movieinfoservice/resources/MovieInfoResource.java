package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(String movieId){
        return new Movie("Transformer","TransformerId");
    }
}
