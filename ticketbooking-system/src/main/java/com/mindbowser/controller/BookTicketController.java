package com.mindbowser.controller;

import static com.mindbowser.constant.UrlMapping.BASE_URL;
import static com.mindbowser.constant.UrlMapping.BOOKED_SEATS;
import static com.mindbowser.constant.UrlMapping.TICKET_BOOKING;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mindbowser.dto.BookTicketDto;
import com.mindbowser.entity.BookTicket;
import com.mindbowser.service.BookTicketService;
import com.mindbowser.util.ResponseMaker;
import com.mindbowser.util.SucessResponse;

@RestController
@RequestMapping(BASE_URL)
@CrossOrigin("*")
public class BookTicketController {

	@Autowired
	private BookTicketService bookTicketService;

	@Autowired
	private ResponseMaker responseMaker;

	@PostMapping(TICKET_BOOKING)
	public ResponseEntity<SucessResponse<BookTicket>> saveBooking(@RequestBody BookTicketDto bookTicketDto) {

		BookTicket bookTicket = bookTicketService.saveBooking(bookTicketDto);
		return responseMaker.sucessResponse(bookTicket, HttpStatus.OK);
	}

	@GetMapping(TICKET_BOOKING)
	public ResponseEntity<SucessResponse<List<BookTicket>>> getBookings() {
		List<BookTicket> bookTickets = bookTicketService.getBooking();
		return responseMaker.sucessResponse(bookTickets, HttpStatus.OK);
	}

	@GetMapping(BOOKED_SEATS)
	public ResponseEntity<SucessResponse<List<BookTicket>>> getSeats(@PathVariable Long id) {
		List<BookTicket> bookTicket = bookTicketService.getSeats(id);
		System.out.println(bookTicket.toString());
		return responseMaker.sucessResponse(bookTicket, HttpStatus.OK);
	}
}
