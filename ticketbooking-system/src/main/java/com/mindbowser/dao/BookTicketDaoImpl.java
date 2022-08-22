package com.mindbowser.dao;

import static com.mindbowser.constant.UrlMapping.ERROR_MESSAGE;
import static com.mindbowser.constant.UrlMapping.ERROR_MSG_SAVE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.entity.BookTicket;
import com.mindbowser.enums.ErrorCode;
import com.mindbowser.exception.CustomException;
import com.mindbowser.repository.BookTicketRepository;

@Service
public class BookTicketDaoImpl implements BookTicketDao {

	@Autowired
	private BookTicketRepository bookTicketRepository;

	@Override
	public BookTicket saveBooking(BookTicket bookTicket) {

		try {
			return bookTicketRepository.save(bookTicket);
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.INTERNAL_SERVER_ERROR, e.getMessage(), ERROR_MSG_SAVE);
		}
	}

	@Override
	public List<BookTicket> getBooking() {

		try {
			return bookTicketRepository.findAll();
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.NOT_FOUND, e.getMessage(), ERROR_MESSAGE);
		}

	}

	@Override
	public List<BookTicket> getSeats(Long id) {

		try {
			return bookTicketRepository.findSeats(id);
		}
		catch (Exception e) {
			throw new CustomException(ErrorCode.NOT_FOUND, e.getMessage(), ERROR_MESSAGE);
		}

	}

}
