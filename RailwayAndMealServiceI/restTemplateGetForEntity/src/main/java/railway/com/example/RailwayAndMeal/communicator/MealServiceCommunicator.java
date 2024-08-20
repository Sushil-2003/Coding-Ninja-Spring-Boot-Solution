package railway.com.example.RailwayAndMeal.communicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import railway.com.example.RailwayAndMeal.Entity.Meal;

/*
 * 1. Create a method to get the Meal Details from meal service with the help
 * 	   of RestTemplate.
 * 2. Use getForEntity() method from the RestTemplate class.
 * 3. Make use of proper annotations to autowire.
 * 4. Use Postman app to test the APIs.
 */
@Service
public class MealServiceCommunicator {
	
	private final RestTemplate restTemplete;
	
	@Autowired
	public MealServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplete = restTemplateBuilder.build();
	}
	
	public Meal getMealByPnr(long pnr) {
		String url = "http://localhost:8081/pantry/meal/";
		
		ResponseEntity<Meal> response = restTemplete.getForEntity(url + pnr, Meal.class);
		return response.getBody();
	}
}
