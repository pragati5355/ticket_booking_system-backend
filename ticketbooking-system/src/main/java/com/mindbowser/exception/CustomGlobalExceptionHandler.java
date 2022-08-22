package com.mindbowser.exception;

import static com.mindbowser.constant.UrlMapping.ERROR_MESSAGE;
import java.util.Date;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.mindbowser.util.ErrorResponse;

@RestControllerAdvice
public class CustomGlobalExceptionHandler {

	@ExceptionHandler(value = {CustomException.class})
	public ErrorResponse handleCustomException(CustomException e) {
		return new ErrorResponse(new Date(), ERROR_MESSAGE,
				e.getMessage(), e.getErrorCode().getCode(),
				e.getMessage());
	}

}
