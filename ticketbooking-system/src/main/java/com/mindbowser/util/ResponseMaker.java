package com.mindbowser.util;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.mindbowser.entity.BookTicket;

@Component
public class ResponseMaker {

	public <T> ResponseEntity<SucessResponse<T>> sucessResponse(T data, HttpStatus status) {
		SucessResponse<T> response = new SucessResponse<>(data, status.value());

		return new ResponseEntity<>(response, status);
	}

	public <T> ResponseEntity<ErrorResponse> errorResponse(String message, int errorCode) {
		ErrorResponse response = new ErrorResponse(message, errorCode, true);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public ResponseEntity<SucessResponse<BookTicket>> sucessResponse(BookTicket bookTicket, String sucessResponse, HttpStatus ok) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<SucessResponse<List<BookTicket>>> sucessResponse(List<BookTicket> bookTicket, String sucessResponse, HttpStatus ok) {
		// TODO Auto-generated method stub
		return null;
	}

}
