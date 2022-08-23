package com.mindbowser.dto;

import javax.validation.constraints.NotBlank;

public class MovieDto {

	@NotBlank
	private String moviePoster;

	@NotBlank
	private String movieTitle;

	@NotBlank
	private String movieSubtitle;

	@NotBlank
	private String movieText;

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
