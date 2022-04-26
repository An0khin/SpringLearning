package com.home.controllers;

import com.home.dao.MovieDAO;
import com.home.forms.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movies")
public class FirstController {
    MovieDAO movieDAO;

    @Autowired
    public FirstController(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("movies", movieDAO.showAll());
        return "index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id , Model model) {
        model.addAttribute("movie", movieDAO.showOne(id));
        return "show";
    }

    @GetMapping("/new")
    public String newMovie(Model model) {
        model.addAttribute("movie", new Movie());
        return "new";
    }

    @PostMapping
    public String create(@ModelAttribute("movie") Movie movie) {
        movieDAO.createNew(movie);
        return "redirect:/movies";
    }
}
