package com.moviera.dao;

import com.moviera.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: EXT02D8158
 * Date: 20.01.2019
 * Time: 21:06
 */
@Repository
public interface MovieDao
{
    void addMovie(Movie movie);

    Movie getMovieById(String id);

    List<Movie> getAllMovies();

    void deleteMovie(String id);
}
