package com.moviera.repository;

import com.moviera.model.Movie;
import com.moviera.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

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

    public Movie findById(Long id){
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

    public void deleteById(Long id){
        Movie movie = findById(id);
        em.remove(movie);
    }

    public void tryEntityManagerFuncs(){

        Movie movie = new Movie("Butterfly Effect");
        em.persist(movie);

        Movie movie1 = new Movie("The Godfather");
        em.persist(movie1);

        em.flush();

        movie.setMovieName("Paranormal Activity");

        em.detach(movie);

        movie1.setMovieName("Recep Ivedik");

        em.refresh(movie1);

        em.flush();
/*
        em.detach(movie);
*/



/*
        Movie movie = new Movie("Butterfly Effect");
        em.persist(movie);
        em.flush();
  //      em.detach(movie);

        movie.setMovieName("Paranotmal Activity");
        em.flush();

        Movie movie2 = new Movie("Donnie Darko");
        em.persist(movie2);
        em.flush();

        em.clear();
        em.detach(movie);
        em.detach(movie2);
        movie.setMovieName("Mr. Nobody");
        em.flush();*/
    }

    public void addReviewsForMovie() {
        //get the course 10005
        Movie movie = findById(10005L);

        //add 2 reviews to it
        Review review = new Review(3.5,"Average");
        Review review2 = new Review(5.0,"Sick!!");

        movie.addReviews(review);
        movie.addReviews(review2);

        review.setMovie(movie);
        review2.setMovie(movie);
        //save it to db

        em.persist(review);
        em.persist(review2);

    }

    public void addReviewsForMovie(Long movieId, List<Review> reviews) {
        //get the course 10005
        Movie movie = findById(movieId);

       for (Review review : reviews){

           movie.addReviews(review);
           review.setMovie(movie);
           em.persist(review);
       }

    }
}
