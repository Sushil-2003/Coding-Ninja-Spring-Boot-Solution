package com.sushil10.hotelApplication.communicator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.sushil10.hotelApplication.exceptions.HttpRatingServiceNotFound;

@Service
public class RtingServiceCommunicator {

	private final RestTemplate restTemplate;
	
	@Autowired
	public RtingServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}
	
	public long getRating(String id) {
		String url = "http://localhost:8081/rating/id/";
		
		ResponseEntity<Long> response = restTemplate.getForEntity(url+id, Long.class);
		//Long ratingResponse = restTemplate.getForObject(url+id, Long.class);
		return response.getBody();
	}

	public void addRating(Map<String, Long> ratingMap) {
		
		String url = "http://localhost:8081/rating/add";
		
		//restTemplate.postForObject(url, ratingMap, Object.class);
		
		HttpEntity requestEntity = new HttpEntity(ratingMap);
		restTemplate.exchange(url, HttpMethod.POST,requestEntity,Object.class);
	}
	
	public void updateRating(Map<String, Long> ratingMap) {
		
		String url = "http://localhost:8081/rating/update";
		
		//restTemplate.postForObject(url, ratingMap, Object.class);
		
		HttpEntity requestEntity = new HttpEntity(ratingMap);
		restTemplate.exchange(url, HttpMethod.PUT,requestEntity,Object.class);
	}
	
	public void deleteRating(String id) {
		
		String url = "http://localhost:8081/rating/remove/id/";
		try {
			restTemplate.exchange(url + id, HttpMethod.DELETE,null,Object.class);
		}catch (HttpClientErrorException e) {
			throw new HttpRatingServiceNotFound(HttpStatusCode.valueOf(HttpStatus.NOT_FOUND.value()));
		}
	}
}
