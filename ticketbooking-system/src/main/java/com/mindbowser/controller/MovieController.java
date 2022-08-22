package com.mindbowser.controller;

import static com.mindbowser.constant.UrlMapping.BASE_URL;
import static com.mindbowser.constant.UrlMapping.MOVIES;
import static com.mindbowser.constant.UrlMapping.SINGLE_MOVIE;
import static com.mindbowser.constant.UrlMapping.SUCESS_RESPONSE;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindbowser.dto.MovieDto;
import com.mindbowser.entity.Movie;
import com.mindbowser.service.MovieService;
import com.mindbowser.util.ResponseMaker;
import com.mindbowser.util.SucessResponse;

@RestController
@RequestMapping(BASE_URL)
@CrossOrigin("*")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@Autowired
	private ResponseMaker responseMaker;

	@PostMapping(MOVIES)
	public ResponseEntity<SucessResponse<String>> addMovies(@RequestBody @Valid MovieDto movieDto) {

		movieService.addMovie(movieDto);
		return responseMaker.sucessResponse(SUCESS_RESPONSE, HttpStatus.OK);
	}

	@GetMapping(MOVIES)
	public List<Movie> getAllMovie() {
		return movieService.getAllMovies();
	}

	@GetMapping(SINGLE_MOVIE)
	public ResponseEntity<SucessResponse<Movie>> findById(@PathVariable Long id) {
		Movie movie = movieService.findById(id);
		return responseMaker.sucessResponse(movie, HttpStatus.OK);
	}

}
