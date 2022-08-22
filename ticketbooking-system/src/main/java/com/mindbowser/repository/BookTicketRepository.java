package com.mindbowser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mindbowser.entity.BookTicket;

@Repository
public interface BookTicketRepository extends JpaRepository<BookTicket, Long> {

}
