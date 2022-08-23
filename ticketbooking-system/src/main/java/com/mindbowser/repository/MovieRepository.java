package com.mindbowser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mindbowser.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	Movie findMovieById(Long id);
}
