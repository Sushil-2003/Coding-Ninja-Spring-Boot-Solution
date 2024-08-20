package com.example.MovieTicket.MovieBooking.service;

import java.util.List;
import com.example.MovieTicket.MovieBooking.Model.Movie;

public interface MovieServiceInterface {

	List<Movie> getAllMovies();
    void addMovie(Movie movie);
    Movie getMovieById(String id);
    void deleteMovieById(String id);
    void updateMovieById(String id, Movie movie);
    
}
