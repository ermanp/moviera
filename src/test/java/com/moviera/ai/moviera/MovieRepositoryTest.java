package com.moviera.ai.moviera;

import com.moviera.MovieraApplication;
import com.moviera.model.Movie;
import com.moviera.repository.MovieRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * User: Erman PAYASLI
 * Date: 30.03.2019
 * Time: 11:59
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieraApplication.class)
public class MovieRepositoryTest
{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MovieRepository movieRepository;

    @Test
    @DirtiesContext
    public void deleteById_basic(){

        movieRepository.deleteById("1");
        assertNull(movieRepository.findById("1"));
    }

    @Test
    public void findById_basic(){

        Movie movie = movieRepository.findById("1");
        assertEquals("TestMovie_1",movie.getMovieName());

        logger.info("Testing is Running");
    }


}
