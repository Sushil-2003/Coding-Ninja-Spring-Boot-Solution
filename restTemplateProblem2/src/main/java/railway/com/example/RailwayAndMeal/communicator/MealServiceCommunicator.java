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
		/** Use the "postForEntity()" method to make a post call.
		   This method saves a meal object in the "Meal Application". **/
		String url = "http://localhost:8081/pantry/meal";
	
		restTemplate.postForEntity(url, meal, Object.class);
	}
}
