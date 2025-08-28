package com.drew.mapper;

import com.drew.dto.CustomerDto;
import com.drew.dto.MovieDto;
import com.drew.entity.Customer;

import java.util.List;

public class EntityDtoMapper {

    public static CustomerDto toDto(Customer customer, List<MovieDto> movies) {
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getFavoriteGenre(),
                movies
        );
    }
}
