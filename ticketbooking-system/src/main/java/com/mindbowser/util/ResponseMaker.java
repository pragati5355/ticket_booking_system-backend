package com.mindbowser.util;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.mindbowser.exception.ValidatioErrorResponse;

@Component
public class ResponseMaker {

	public <T> ResponseEntity<SucessResponse<T>> sucessResponse(T data, HttpStatus status) {
		SucessResponse<T> response = new SucessResponse<>(data, status.value());

		return new ResponseEntity<>(response, status);
	}

	public ResponseEntity<ErrorResponse> errorResponse(String message, int errorCode) {
		ErrorResponse response = new ErrorResponse(message, errorCode, true);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public ResponseEntity<Object> validationErrorsResponse(String message, List<ValidatioErrorResponse> validatioErrorResponses) {

		ErrorResponse response = new ErrorResponse(message, HttpStatus.BAD_REQUEST.value(), true);
		response.setValidationErros(validatioErrorResponses);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
