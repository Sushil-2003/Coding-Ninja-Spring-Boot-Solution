package com.example.MovieTicket.MovieBooking.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MovieTicket.MovieBooking.Exceptions.IdAlreadyExist;
import com.example.MovieTicket.MovieBooking.Exceptions.IdNotFound;
import com.example.MovieTicket.MovieBooking.Model.Movie;
import com.example.MovieTicket.MovieBooking.communicator.RatingRestCommunicator;

@Service
public class MovieService implements MovieServiceInterface{
	
	List<Movie> movieList = new ArrayList<>();
	Map<String,Movie> movieMap= new HashMap<>();

	@Autowired
	RatingRestCommunicator ratingRestCommunicator;
	
	@Override
	public List<Movie> getAllMovies() {
		return movieList;
	}

	@Override
	public void addMovie(Movie movie) {
		if(movieMap.containsKey(movie.getId())) {
			throw new IdAlreadyExist("Movie with id " + movie.getId() + " already exists.");
		}
		movieList.add(movie);
		movieMap.put(movie.getId(), movie);
		
		Map<String, Long> ratingMap = new HashMap<String, Long>();
		
		ratingMap.put(movie.getId(), movie.getMovieRating());
		ratingRestCommunicator.addRating(ratingMap);
	}

	@Override
	public Movie getMovieById(String id) {
		if(!movieMap.containsKey(id)){
			throw new IdNotFound("Movie with id " + id + " not found.");
		}
		Movie movie = movieMap.get(id);

		long updatedRating = ratingRestCommunicator.getRating(id);
		
		movie.setMovieRating(updatedRating);
		
		return movie;
	}

	@Override
	public void deleteMovieById(String id) {
		if(!movieMap.containsKey(id)){
			throw new IdNotFound("Movie with id " + id + " not found.");
		}
		Movie movie = getMovieById(id);
		movieList.remove(movie);
		movieMap.remove(id);
		ratingRestCommunicator.deleteRating(id);
	}

	@Override
	public void updateMovieById(String id, Movie updateMovie) {
		if(!movieMap.containsKey(id)){
			throw new IdNotFound("Movie with id " + id + " not found.");
		}
		Movie existingmovie= getMovieById(updateMovie.getId());
		
		movieList.remove(existingmovie);
		movieList.add(updateMovie);
		
		movieMap.put(updateMovie.getId(), updateMovie);
		
		Map<String,Long> updatedRating = new HashMap<String, Long>();
		updatedRating.put(updateMovie.getId(), updateMovie.getMovieRating());
		ratingRestCommunicator.updateRating(updatedRating);
	}
}