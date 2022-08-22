package com.mindbowser.dto;

import javax.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;

public class MovieDto {

	@NotBlank
	@NonNull
	private String moviePoster;

	@NotBlank
	@NonNull
	private String movieTitle;

	@NotBlank
	@NonNull
	private String movieSubtitle;

	@NotBlank
	@NonNull
	private String movieText;

	@NonNull
	@NotBlank
	private String type;

	public String getMoviePoster() {
		return moviePoster;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public String getMovieSubtitle() {
		return movieSubtitle;
	}

	public String getMovieText() {
		return movieText;
	}

	public String getType() {
		return type;
	}

}
