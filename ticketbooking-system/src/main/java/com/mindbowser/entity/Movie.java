package com.mindbowser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column(name = "movie_image")
	private String moviePoster;

	@Column(name = "movie_title")
	private String movieTitle;

	@Column(name = "movie_subtitle")
	private String movieSubtitle;

	@Column(name = "movie_text")
	private String movieText;

	@Column(name = "type")
	private String type;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Long id, String moviePoster, String movieTitle, String movieSubtitle, String movieText, String type) {
		super();
		Id = id;
		this.moviePoster = moviePoster;
		this.movieTitle = movieTitle;
		this.movieSubtitle = movieSubtitle;
		this.movieText = movieText;
		this.type = type;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getMoviePoster() {
		return moviePoster;
	}

	public void setMoviePoster(String moviePoster) {
		this.moviePoster = moviePoster;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getMovieSubtitle() {
		return movieSubtitle;
	}

	public void setMovieSubtitle(String movieSubtitle) {
		this.movieSubtitle = movieSubtitle;
	}

	public String getMovieText() {
		return movieText;
	}

	public void setMovieText(String movieText) {
		this.movieText = movieText;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
