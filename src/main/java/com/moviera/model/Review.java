package com.moviera.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * User: EXT02D8158
 * Date: 19.01.2019
 * Time: 17:36
 */
@Entity
@Table(name = "T_REVIEW")
public class Review
{
/*    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "ID")*/
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "RATING")
    private double rating;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @ManyToOne
    private Movie movie;

    public Review() {}

    public Review(double rating, String description)
    {
        this.rating = rating;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString()
    {
        return String.format("Review[%s%s]",rating,description);
    }
}
