package com.mindbowser.entity;

import java.util.Arrays;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class BookTicket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_email")
	private String userEmail;

	@Column(name = "user_mobileno")
	private String userMobileno;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movie_id", nullable = false, updatable = false)
	private Movie movie;

	@Column(name = "seats")
	private String[] seat;

	public BookTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BookTicket [Id=" + Id + ", userName=" + userName + ", userEmail=" + userEmail + ", userMobileno=" + userMobileno + ", movie=" + movie + ", seat=" + Arrays.toString(seat) + "]";
	}

	public BookTicket(Long id, String userName, String userEmail, String userMobileno, Movie movie, String[] seat) {
		super();
		Id = id;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userMobileno = userMobileno;
		this.movie = movie;
		this.seat = seat;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserMobileno() {
		return userMobileno;
	}

	public void setUserMobileno(String userMobileno) {
		this.userMobileno = userMobileno;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}

}
