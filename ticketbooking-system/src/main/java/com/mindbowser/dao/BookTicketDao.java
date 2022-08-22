package com.mindbowser.dao;

import java.util.List;
import com.mindbowser.entity.BookTicket;

public interface BookTicketDao {

	public BookTicket saveBooking(BookTicket bookTicket);

	public List<BookTicket> getBooking();

	public List<BookTicket> getSeats(Long id);
}
