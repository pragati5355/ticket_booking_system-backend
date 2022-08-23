package com.mindbowser.constant;

public class UrlMapping {

	private UrlMapping() {
		throw new IllegalStateException("Constants class.can't instatiate");
	}

	// Constant Api's

	public static final String BASE_URL = "api/v1";

	public static final String MOVIES = "movies";

	public static final String SINGLE_MOVIE = "movies/{id}";

	public static final String TICKET_BOOKING = "bookings";

	public static final String BOOKED_SEATS = "seats/{id}";

	// Constant Strings

	public static final String ERROR_MESSAGE = "Something Went Wrong";

	public static final String ERROR_MSG_SAVE = "Error while saving";

	public static final String EXCEPTION_MESSAGE = "Error while converting object";

	public static final String SUCESS_RESPONSE = "Data added sucessfully";

	public static final String VALIDATION_ERROR_MSG = "Please enter valid data";
}
