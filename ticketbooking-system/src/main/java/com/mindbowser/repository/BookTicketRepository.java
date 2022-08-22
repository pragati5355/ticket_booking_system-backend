package com.mindbowser.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mindbowser.entity.BookTicket;

@Repository
public interface BookTicketRepository extends JpaRepository<BookTicket, Long> {

	@Query(value = "SELECT * FROM `ticket-booking-db`.bookings where movie_id=(?1)", nativeQuery = true)
	List<BookTicket> findSeats(Long id);

}
