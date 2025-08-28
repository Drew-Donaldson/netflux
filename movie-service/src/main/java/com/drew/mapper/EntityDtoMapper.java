package com.drew.mapper;

import com.drew.dto.MovieDto;
import com.drew.entity.Movie;

public class EntityDtoMapper {

    public static MovieDto toDto(Movie movie) {
        return new MovieDto(movie.getId(),
                            movie.getTitle(),
                            movie.getReleaseYear(),
                            movie.getGenre());
    }
}
