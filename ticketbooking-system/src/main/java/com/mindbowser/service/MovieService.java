package com.mindbowser.service;

import java.util.List;
import com.mindbowser.dto.MovieDto;
import com.mindbowser.entity.Movie;

public interface MovieService {

	void addMovie(MovieDto movieDto);

	public List<Movie> getAllMovies();

	public Movie findById(Long id);

}
