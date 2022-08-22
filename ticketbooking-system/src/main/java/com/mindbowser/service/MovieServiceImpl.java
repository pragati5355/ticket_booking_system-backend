package com.mindbowser.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.dao.MovieDao;
import com.mindbowser.dto.MovieDto;
import com.mindbowser.entity.Movie;
import com.mindbowser.mapper.Mapper;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	@Autowired
	private Mapper mapper;

	@Override
	public void addMovie(MovieDto movieDto) {

		Movie movie = mapper.convert(movieDto, Movie.class);
		movieDao.addMovie(movie);

	}

	@Override
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
	}

	@Override
	public Movie findById(Long id) {
		return movieDao.findById(id);
	}

}
