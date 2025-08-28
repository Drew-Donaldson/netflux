package com.drew.dto;

import com.drew.domain.Genre;

import java.util.List;

public record CustomerDto(Integer id,
                          String name,
                          Genre favoriteGenre,
                          List<MovieDto> recommendedMovies) {
}
