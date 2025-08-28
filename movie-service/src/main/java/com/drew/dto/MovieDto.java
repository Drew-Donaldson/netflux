package com.drew.dto;

import com.drew.domain.Genre;

public record MovieDto(Integer id,
                       String title,
                       Integer releaseYear,
                       Genre genre) {
}
