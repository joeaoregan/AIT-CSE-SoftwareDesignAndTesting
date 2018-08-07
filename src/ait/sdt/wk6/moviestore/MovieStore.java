/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 * Software Design and Testing: MovieStore
 */
package ait.sdt.wk6.moviestore;

import java.util.ArrayList;

public class MovieStore {
	public int numberOfMoviesRented;

	ArrayList<Movie> movieList = new ArrayList<Movie>();

	public int getNumOfMoviesInStore() {
		return movieList.size();
	}

	public void addMovie(Movie movie) {
		movieList.add(movie);
	}

	public void removeMovie(Movie movie) {
		movieList.remove(movie);
	}

	public String rentMovie(String title) {
		Boolean found = false;
		String response = "";
		if (numberOfMoviesRented >= 2) {
			return "LIMIT EX";
		}

		for (Movie movie : movieList) {
			if (movie.getTitle().equals(title)) {
				found = true;
				if (!movie.isOnLoan()) {
					movie.setOnLoan(true);
					numberOfMoviesRented++;
					response = "OK";
				} else {
					response = "ONLOAN";
				}
			}
		}

		if (!found) {
			response = "NOT FOUND";
		}

		return response;
	}

	public int getNumMoviesWithGenre(String genre) {
		int count = 0;
		for (Movie movie : movieList) {
			if (movie.getGenre().equals(genre)) {
				count++;
			}
		}
		return count;
	}
}
