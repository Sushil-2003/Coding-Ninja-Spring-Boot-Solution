package railway.com.example.RailwayAndMeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RailwayAndMealApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayAndMealApplication.class, args);
	}
	
	@Bean("restTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
