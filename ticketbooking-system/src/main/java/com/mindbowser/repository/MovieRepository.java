package com.mindbowser.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mindbowser.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Optional<Movie> findMovieById(Long id);
}
