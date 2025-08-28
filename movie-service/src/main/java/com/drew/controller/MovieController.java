package com.drew.controller;

import com.drew.domain.Genre;
import com.drew.dto.MovieDto;
import com.drew.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<MovieDto> getAll() {
        return this.service.getAll();
    }

    @GetMapping("{genre}")
    public List<MovieDto> getAllByGenere(@PathVariable Genre genre) {
        return this.service.getAll(genre);
    }
}
