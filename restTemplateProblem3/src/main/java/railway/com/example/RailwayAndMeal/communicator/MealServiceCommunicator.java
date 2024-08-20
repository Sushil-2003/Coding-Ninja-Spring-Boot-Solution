package railway.com.example.RailwayAndMeal.communicator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import railway.com.example.RailwayAndMeal.Entity.Meal;

@Service
public class MealServiceCommunicator {
	
	private final RestTemplate restTemplate;
	String baseURL = "http://localhost:8081/pantry";
	
	@Autowired
	MealServiceCommunicator(RestTemplateBuilder restTemplateBuilder){
		restTemplate = restTemplateBuilder.build();
	}
	
	public Meal getMealByPnr(long pnr) {
		String url = baseURL + "/meal/" + pnr;
		Meal meal = restTemplate.getForObject(url, Meal.class);
		return meal;
	}
	
	public void setMeal(Meal meal) {
		String url = baseURL + "/meal";
		restTemplate.postForEntity(url, meal, Object.class);
	}
	/**
	 Complete the "deleteMeal()" method by using the "exchange()" 
	 method of the "RestTemplate" to make a delete call to the given URL. 
	 **/
	
	public void deleteMeal(Long pnr) {
		 String url = baseURL + "/meal/" + pnr;
	     restTemplate.exchange(url, HttpMethod.DELETE, null, Object.class);
	}
	
	/** 
	Complete the "updateMeal()" method by using the "exchange()" method of the 
	"RestTemplate" to make a put call to the given URL.
	**/
	
	public void updateMeal(Meal meal) {
		String url = baseURL + "/meal/";
        HttpEntity<Meal> requestEntity = new HttpEntity<>(meal);
        restTemplate.exchange(url, HttpMethod.PUT, requestEntity, Object.class);
	}
	
}
