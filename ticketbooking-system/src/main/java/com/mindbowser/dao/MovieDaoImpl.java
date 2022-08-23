package com.mindbowser.dao;

import static com.mindbowser.constant.UrlMapping.ERROR_MESSAGE;
import static com.mindbowser.constant.UrlMapping.ERROR_MSG_SAVE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mindbowser.entity.Movie;
import com.mindbowser.enums.ErrorCode;
import com.mindbowser.exception.CustomException;
import com.mindbowser.repository.MovieRepository;

@Repository
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public void addMovie(Movie movie) {

		try {
			movieRepository.save(movie);
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.INTERNAL_SERVER_ERROR, e.getMessage(), ERROR_MSG_SAVE);
		}
	}

	@Override
	public List<Movie> findAll() {

		try {
			return movieRepository.findAll();
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.NOT_FOUND, e.getMessage(), ERROR_MESSAGE);
		}
	}

	@Override
	public Movie findById(Long id) {

		Movie movie = movieRepository.findMovieById(id);
		if (movie != null) {
			return movie;
		}
		else {
			throw new CustomException(ErrorCode.NOT_FOUND, ERROR_MESSAGE);
		}
	}

}
