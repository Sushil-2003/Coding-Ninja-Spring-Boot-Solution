package com.example.MovieTicket.MovieBooking.Model;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Movie {
	
	@Min(value = 1)
	private String id;
	@Size(min = 3, max = 20)
	private String movieName;
	@NotNull(message = "cannot be null")
	private String movieDirector;
	private String movieLanguage;
	@Min(value = 1)
	@Max(value = 10)
	private long movieRating;
	private List<String>writers;
	private List<String>actors;
	private List<String>genre;
	
	public Movie(){}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName + ", movieDirector=" + movieDirector + ", movieLanguage="
				+ movieLanguage + ", movieRating=" + movieRating + ", writers=" + writers + ", actors=" + actors
				+ ", genre=" + genre + "]";
	}

	public Movie(String id, String movieName, String movieDirector, String movieLanguage, long movieRating,
			List<String> writers, List<String> actors, List<String> genre) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieDirector = movieDirector;
		this.movieLanguage = movieLanguage;
		this.movieRating = movieRating;
		this.writers = writers;
		this.actors = actors;
		this.genre = genre;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public long getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(long movieRating) {
		this.movieRating = movieRating;
	}
	public List<String> getWriters() {
		return writers;
	}
	public void setWriters(List<String> writers) {
		this.writers = writers;
	}
	public List<String> getActors() {
		return actors;
	}
	public void setActors(List<String> actors) {
		this.actors = actors;
	}
	public List<String> getGenre() {
		return genre;
	}
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	
}
