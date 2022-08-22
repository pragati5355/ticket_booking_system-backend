package com.mindbowser.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindbowser.dao.BookTicketDao;
import com.mindbowser.dao.MovieDao;
import com.mindbowser.dto.BookTicketDto;
import com.mindbowser.entity.BookTicket;
import com.mindbowser.entity.Movie;

@Service
public class BookTicketServiceImpl implements BookTicketService {

	@Autowired
	private BookTicketDao bookTicketDao;

	@Autowired
	private MovieDao movieDao;

	@Override
	public BookTicket saveBooking(BookTicketDto bookTicketDto) {

		Movie movie = movieDao.findById(bookTicketDto.getMovieId());
		BookTicket bookTicket = new BookTicket();
		bookTicket.setUserName(bookTicketDto.getUserName());
		bookTicket.setUserEmail(bookTicketDto.getUserEmail());
		bookTicket.setUserMobileno(bookTicketDto.getUserMobileno());
		bookTicket.setSeat(bookTicketDto.getSeats());
		bookTicket.setMovie(movie);

		return bookTicketDao.saveBooking(bookTicket);
	}

	@Override
	public List<BookTicket> getBooking() {
		return bookTicketDao.getBooking();
	}

	@Override
	public List<BookTicket> getSeats(Long id) {
		return bookTicketDao.getSeats(id);
	}

}
