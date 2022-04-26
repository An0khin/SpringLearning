package com.home.dao;

import com.home.forms.Movie;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieDAO {
    private static int MOVIES_COUNT;

    private List<Movie> movieList = new ArrayList<>();

    {
        movieList.add(new Movie("Hopla", ++MOVIES_COUNT, 5));
        movieList.add(new Movie("Hoplwe", ++MOVIES_COUNT, 5));
        movieList.add(new Movie("Hoplasd", ++MOVIES_COUNT, 5));
        movieList.add(new Movie("Hoplafdg", ++MOVIES_COUNT, 5));
        movieList.add(new Movie("Hohgpla", ++MOVIES_COUNT, 5));
    }

    public List<Movie> showAll() {
        return movieList;
    }

    public Movie showOne(int id) {
        return movieList.stream().filter(movie -> movie.getId() == id).findAny().orElse(null);
    }

    public void createNew(Movie movie) {
        movie.setId(++MOVIES_COUNT);
        movieList.add(movie);
    }
}
