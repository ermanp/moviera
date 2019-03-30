package com.moviera.dao.impl;

import com.moviera.dao.MovieDao;
import com.moviera.model.Movie;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: EXT02D8158
 * Date: 20.01.2019
 * Time: 21:08
 */
@Repository
@Transactional
public class MovieDaoImpl
{
    /*@Autowired
    private SessionFactory sessionFactory;

    public void addMovie(Movie movie)
    {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(movie);
        session.flush();

    }

    public Movie getMovieById(String id)
    {
        Session session = sessionFactory.getCurrentSession();
        Movie movie = (Movie) session.get(Movie.class, id);
        return movie;
    }

    public List<Movie> getAllMovies()
    {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Movie");
        List<Movie> movies = query.list();
        session.flush();

        return movies;
    }

    public void deleteMovie(String id)
    {

    }*/
}
