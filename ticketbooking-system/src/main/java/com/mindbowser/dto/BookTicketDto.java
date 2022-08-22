package com.mindbowser.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.lang.NonNull;

public class BookTicketDto {

	@NotNull
	@NotBlank
	private String userName;

	@NotNull
	@NotBlank
	private String userEmail;

	@NonNull
	@NotBlank
	private String userMobileno;

	@NotNull
	@NotBlank
	private Long movieId;

	@NotEmpty
	@NotNull
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
