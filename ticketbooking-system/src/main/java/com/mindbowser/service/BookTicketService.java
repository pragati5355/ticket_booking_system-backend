package com.mindbowser.service;

import java.util.List;
import com.mindbowser.dto.BookTicketDto;
import com.mindbowser.entity.BookTicket;

public interface BookTicketService {

	public BookTicket saveBooking(BookTicketDto bookTicketDto);

	public List<BookTicket> getBooking();

	public List<BookTicket> getSeats(Long id);
}
