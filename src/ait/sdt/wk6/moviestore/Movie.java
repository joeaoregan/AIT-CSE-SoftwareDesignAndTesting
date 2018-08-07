/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 * Software Design and Testing: MovieStore
 */
package ait.sdt.wk6.moviestore;

public class Movie {
	private String title;
	private String genre;
	public Boolean onLoan;

	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
		onLoan = false;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public Boolean isOnLoan() {
		return onLoan;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setOnLoan(Boolean onLoan) {
		this.onLoan = onLoan;
	}
}
