## Unit Testing Movie Store

### Instructions

Time Allowed: 2.5 hrs

Upload to moodle a .zip file of your eclipse project and this word document with the screenshots included. Please use the snipping tool to paste in screenshots from eclipse. If you paste the code as text msword may autocorrect. NB Make sure you upload the correct files. 

**N.B.Name your test methods as specified in this document.**

Notes on Marking Scheme

1.	Your production code and your test code must compile.
2.	You test should be passing (green bar) before it will be marked. No marks for partially completed/failing tests or for partially completed code or code with compilation errors.
3.	Implement the tests one by one as specified in this document.
4.	Name the tests as specified in the document

### UML Diagram

```
+--------------------------------------------------+              +------------------------------+
|                   + MovieStore                   |              |           + Movie            |
+--------------------------------------------------+              +------------------------------+
| -numberOfMoviesRented : Integer                  |              | -title : String              |
+--------------------------------------------------+  1      0..* | -genre : String              |
| +getNumOfMoviesInStore() : Integer               |--------------| +onLoan : Boolean            |
| +addMovie(aMovie : Movie)                        |              +------------------------------+
| +removeMovie(aMovie : Movie)                     |              | +getTitle() : String         |
| +rentMovie(title : String) : String              |              | +getGenre() : String         |
| +getNumMoviesWithGenre(genre : String) : Integer |              | +isOnLoan() : Boolean        |
+--------------------------------------------------+              | +setTitle(title : String)    |
                                                                  | +setGenre(genre : String)    |
                                                                  | +setOnloan(onloan : Boolean) |
                                                                  +------------------------------+
```
 
	Figure 1

A Movie Store contains a collection of movies. 

We assume a movie is identified by its title (assume unique) and that the movie store has only one copy of each movie title.

Also assume that the Movie Store will have only one customer. The instance variable numOfMoviesRented will keep track of how many movies its one customer has rented. 

The Movie Store will implement the following User Stories

1.	As a store assistant I want to be able to check how many movies I have in the store so that I can track my stock levels.
2.	As a store assistant I want to be able to add movies to the Movie Store so that I can add new movie releases to the system
3.	As a store assistant I want to be able to remove a movie from the Movie Store so that a movie is removed when it is no longer stocked.
4.	As a store assistant I want to be able to check how many movies of a particular genre are stocked so that I can answer customer queries.
5.	As a customer I want to be able to rent a movie so that I can view the movie.

First write a unit test class MovieTest that tests the constructor and the getters and setters of the Movie class. The tests should be called testMovieConstructor, testSetOnLoad, testChangeGenre, testChangeTitle.

1.	Starting the project – Create a separate folder for your test code.
2.	Make a package called `com.ait.moviestore` in the src folder and in the test folder. Add a class called `Movie` to the src and a junit class called `MovieTest` to the tests folder as show below. `MovieTest` should test the constructor and the getters and setters. `Movie` class has a constructor that takes two Strings representing title and genre as arguments. The instance variable onLoan should be given a default value of “false”. Name your tests as shown in Figure 3.

```
▾ 📁 MovieStore
  ▾ 📂 src
    ▾ 📦 com.ait.moviestore
      > 📄 Movie.java
  ▾ 📂 test
    ▾ 📦 com.ait.moviestore
      > 📄 MovieTest.java
```
    Figure 2

```
▾ 📄 com.ait.moviestore.MovieTest
    📄 testMovieConstructor
    📄 testSetOnLoad
    📄 testChangeGenre
    📄 testChangeTitle
```
 
    Figure 3

```
Element                         Coverage
▾ 📂 src                        100%
  ▾ 📦 com.ait.moviestore       100%
    > 📄 Movie.java             100%
▾ 📂 test                       100%
```

    Figure 4

Now we will test the MovieStore functionality, user story by user story. Copy and paste your test code, your code (showing the code coverage) into the word document per user story. Code should be 100% coverage at each step.

### User Story 1

As a store assistant I want to be able to check how many movies I have in the store so that I can track my stock levels.

**Test 1-1** – Call this test `testNoMoviesInStore`. Before any movies are added to the store, there should be no movies in the store. Test that the method `getNumOfMoviesInStore` returns 0 before any movies are added to the store. Add classes `MovieStore` and `MovieStoreTest` to the project as shown.
 
### User Story 2

As a store assistant I want to be able to add movies to the Movie Store so that I can add new releases to the system

**Test 2-1** Call this test `testOneMovieInStore`. Adding a movie to an empty store using `addMovie` method should return one when the number of movies is retrieved using method `getNumOfMoviesInStore`.

**Test 2-2** Call this test `testTwoMoviesInStore`. Adding two movies to an empty store should return two when the number of movies is retrieved using method `getNumOfMoviesInStore`.

### User Story 3

As a store assistant I want to be able to remove a movie from the Movie Store so that a movie is removed when it is no longer stocked.

**Test 3-1** Call this test `testRemoveMovieFromStore`. Add two movies to the store using the `addMovie` method as before in User Story 2. Check that the number of movies in the store is two. Remove one movie from the store using the `removeMovie` method. Check that the number of movies in the store is now one.

### User Story 4

As a store assistant I want to be able to check how many movies of a particular genre are stocked so that I can answer customer queries. 

**Test 4-1** Call this test `testNumMoviesWithGenre` Add two movies with “drama” as a genre and add one movie with the genre “action” to the movie store. Then use the method `getNumMoviesWithGenre` and check that two is returned when “drama” is used as an argument.

### User Story 5 

As a customer I want to be able to rent a movie so that I can view the movie Notes: The method `rentMovie` returns one of the following Strings

| String | Meaning |
|--------|---------|
| “OK”   | Movie has been rented successfully |
| “ONLOAN” | Can’t rent movie because it is already on load |
| “NOT FOUND” | Can’t rent the movie because it doesn’t exist in the store. |
| “LIMIT EX” | The customer is only allowed to rent 2 movies concurrently. This String will be returned if they try to rent a 3rd one; |

**Test 5-1** Call this test `testRentMovieOK`. Add a movie to the store. Attempt to rent the movie using rentMovie method. Check that “OK” is returned. Check that onLoan is set to true for that particular Movie.

**Test 5-2** Call this test `testRentMovieAlreadyRented`. Add a movie to the store. Rent the movie using `rentMovie` method. Check that “OK” is returned. Now try to rent the same movie a second time. Check that the string “ONLOAN” is returned.

**Test 5-3 **Call this test `testRentMovieNotInStore`  Try to rent a movie using a title that has not been added to the movie store. Test that the String “NOT FOUND” is returned.

**Test 5-4 **Call this test `testRentalLimitExceeded`. A customer is only allowed to rent a max. of two movies concurrently. Try to rent a movie if two movies have already been successfully rented. The String “LIMIT EX” should be returned.

---

[MovieStore.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk6/MovieStore.java)  
[Movie.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/src/ait/sdt/wk6/Movie.java)  
[MovieTest.java](https://github.com/joeaoregan/AIT-CSE-SoftwareDesignAndTesting/blob/master/Test/ait/sdt/wk6/MovieTest.java)