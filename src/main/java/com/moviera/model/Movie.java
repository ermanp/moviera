package com.moviera.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * User: EXT02D8158
 * Date: 19.01.2019
 * Time: 17:36
 */
@Entity
public class Movie
{
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "ID")
    private String movieId;

    @Column(name = "MOVIE_NAME")
    private String movieName;



    public Movie() {}

    public Movie(String movieName)
    {
        this.movieName = movieName;
    }

    public String getMovieName()
    {
        return movieName;
    }

    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }

    public String getMovieId()
    {
        return movieId;
    }

    public void setMovieId(String movieId)
    {
        this.movieId = movieId;
    }

    @Override
    public String toString()
    {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
