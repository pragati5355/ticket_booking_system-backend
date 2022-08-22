package com.mindbowser.mapper;

import static com.mindbowser.constant.UrlMapping.EXCEPTION_MESSAGE;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import com.mindbowser.enums.ErrorCode;
import com.mindbowser.exception.CustomException;

@Component
public class Mapper {

	public <T> T convert(Object srcObj, Class<T> targetClass) {
		T response = null;

		try {
			response = new ModelMapper().map(srcObj, targetClass);
		}
		catch (Exception e) {
			throw new CustomException(EXCEPTION_MESSAGE, ErrorCode.INTERNAL_SERVER_ERROR);
		}

		return response;
	}
}
