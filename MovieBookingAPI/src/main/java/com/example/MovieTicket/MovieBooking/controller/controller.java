package com.example.MovieTicket.MovieBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MovieTicket.MovieBooking.Model.Movie;
import com.example.MovieTicket.MovieBooking.service.MovieService;
import com.example.MovieTicket.MovieBooking.service.MovieServiceInterface;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ticket")
public class controller {
	
	@Autowired 
	MovieServiceInterface movieService;
	
	@PostMapping("/movie")
	public void addMovie(@Valid @RequestBody Movie movie, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			throw new RuntimeException("Request Not valid");
		}
		movieService.addMovie(movie);
	} 
	
	@GetMapping("/movie/{id}")
	public Movie getMovieById(@PathVariable String id){
		return movieService.getMovieById(id);
	}
	
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@DeleteMapping("/movie/{id}")
	public void deleteMovieById(@PathVariable String id){
		movieService.deleteMovieById(id);
		
	}
	
	@PutMapping("/update/{id}")
	public void updateMovieById(@Valid @RequestBody Movie movie, BindingResult bindingResult,@PathVariable String id){
		if(bindingResult.hasErrors()) {
			throw new RuntimeException("Request Not valid");
		}
		movieService.updateMovieById(id, movie);
	}
}
