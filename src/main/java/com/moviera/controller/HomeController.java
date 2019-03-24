package com.moviera.controller;

import com.moviera.dao.MovieDao;
import com.moviera.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * User: EXT02D8158
 * Date: 19.01.2019
 * Time: 17:18
 */
@Controller
public class HomeController
{

    @Autowired
    private MovieDao movieDao;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/movies")
    public String getMovies(Model model){
        List<Movie> movieList = movieDao.getAllMovies();
        model.addAttribute("movies", movieList);

        return "movies";
    }

}
