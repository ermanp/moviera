package com.moviera.ai.moviera;

import com.moviera.MovieraApplication;
import com.moviera.model.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * User: Erman PAYASLI
 * Date: 1.04.2019
 * Time: 21:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieraApplication.class)
public class JPQLTest
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EntityManager em;

    @Test
    public void gelAllMovies(){

        Query query = em.createQuery("Select m from Movie m");
        List resultList = query.getResultList();
        logger.info("Select m from Movie m -> {}",resultList);
    }

    @Test
    public void getMoviesByTyped(){
        TypedQuery<Movie> query = em.createQuery("Select m from Movie m", Movie.class);
        List resultList = query.getResultList();
        logger.info("Select m from Movie m -> {}",resultList);
    }

    @Test
    public void jpql_where(){
        TypedQuery<Movie> query = em.createQuery("Select m from Movie m " +
                "where movieName like '%3%'", Movie.class);
        List resultList = query.getResultList();
        logger.info("#####Select m from Movie m -> {}",resultList);

    }
}
