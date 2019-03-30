package com.moviera.repository;

import com.moviera.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * User: Erman PAYASLI
 * Date: 30.03.2019
 * Time: 10:31
 */
@Repository
@Transactional
public class MovieRepository
{
    @Autowired
    EntityManager em;

    public Movie findById(String id){
        return em.find(Movie.class, id);
    }

    public Movie save(Movie movie){
        if(movie.getMovieId() == null){
            em.persist(movie);
        } else {
            em.merge(movie);
        }
        return movie;
    }

    public void deleteById(String id){
        Movie movie = findById(id);
        em.remove(movie);
    }
}
