/*
 * Joe O'Regan
 * A00258304
 * 01/08/2018
 * Software Design and Testing: MovieStore
 */
package ait.sdt.wk6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import ait.sdt.wk6.Movie;

class MovieTest {
	Movie movie;
	MovieStore movieStore;

	@BeforeEach
	void setup() {
		movie = new Movie("Deadpool", "Action");
		movieStore = new MovieStore();
	}

	@Test
	void testMovieConstructor() {
		Movie movie2 = new Movie("Avengers", "Action");
		assertEquals("Avengers", movie2.getTitle());
		assertEquals("Action", movie2.getGenre());
	}

	@Test
	void testSetOnLoan() {
		Movie movie = new Movie("asdf", "adf");
		movie.setOnLoan(true);
		assertTrue(movie.isOnLoan());
	}

	@Test
	void testChangeGenre() {
		movie.setGenre("Adventure");
		assertEquals("Adventure", movie.getGenre());
	}

	@Test
	void testChangeTitle() {
		movie.setTitle("Avengers");
		assertEquals("Avengers", movie.getTitle());
	}

	@Test
	void testNoMoviesInStore() {
		assertEquals(0, movieStore.getNumOfMoviesInStore());
	}

	@Test
	void testOneMovieInStore() {
		movieStore.addMovie(movie);
		assertEquals(1, movieStore.getNumOfMoviesInStore());
	}

	@Test
	void testTwoMoviesInStore() {
		movieStore.addMovie(movie);
		movieStore.addMovie(new Movie("Avengers", "Action"));
		assertEquals(2, movieStore.getNumOfMoviesInStore());
	}

	@Test
	void testRemoveMovieFromStore() {
		movieStore.addMovie(movie);
		movieStore.addMovie(new Movie("Avengers", "Action"));
		assertEquals(2, movieStore.getNumOfMoviesInStore());
		movieStore.removeMovie(movie);
		assertEquals(1, movieStore.getNumOfMoviesInStore());
	}

	@Test
	void testNumMoviesWithGenre() {
		movieStore.addMovie(new Movie("Film1", "Drama"));
		movieStore.addMovie(new Movie("Film2", "Drama"));
		movieStore.addMovie(new Movie("Film3", "Action"));
		assertEquals(2, movieStore.getNumMoviesWithGenre("Drama"));
	}

	@Test
	void testRentMovieOK() {
		movieStore.addMovie(movie);
		assertEquals("OK", movieStore.rentMovie("Deadpool"));
		assertTrue(movie.isOnLoan());
	}

	@Test
	void testRentMovieAlreadyRented() {
		movieStore.addMovie(movie);
		assertEquals("OK", movieStore.rentMovie("Deadpool"));
		assertEquals("ONLOAN", movieStore.rentMovie("Deadpool"));
	}

	@Test
	void testRentMovieNotInStore() {
		assertEquals("NOT FOUND", movieStore.rentMovie("test"));
	}

	@Test
	void testRentalLimitExceeded() {
		movieStore.addMovie(movie);
		assertEquals(1, movieStore.getNumOfMoviesInStore());
		assertEquals("OK", movieStore.rentMovie("Deadpool"));
		Movie movie2 = new Movie("Avengers", "Action");
		movieStore.addMovie(movie2);
		assertEquals(2, movieStore.getNumOfMoviesInStore());
		assertEquals("OK", movieStore.rentMovie("Avengers"));
		movieStore.addMovie(new Movie("movie3", "Drama"));
		assertEquals(3, movieStore.getNumOfMoviesInStore());
		assertEquals("LIMIT EX", movieStore.rentMovie("movie3"));
	}
}
