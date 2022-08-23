package com.mindbowser.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class BookTicketDto {

	@NotBlank
	private String userName;

	@NotBlank
	@Email
	private String userEmail;

	@NotBlank
	private String userMobileno;

	@NotBlank
	private Long movieId;

	@NotEmpty
	private String[] seats;

	public String getUserName() {
		return userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserMobileno() {
		return userMobileno;
	}

	public Long getMovieId() {
		return movieId;
	}

	public String[] getSeats() {
		return seats;
	}

}
