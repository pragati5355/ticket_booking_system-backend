package com.mindbowser.dao;

import java.util.List;
import com.mindbowser.entity.Movie;

public interface MovieDao {

	void addMovie(Movie movie);

	public List<Movie> findAll();

	public Movie findById(Long id);

}
