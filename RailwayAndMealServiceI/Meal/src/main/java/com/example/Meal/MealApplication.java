package com.example.Meal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Meal.Entity.Meal;
import com.example.Meal.service.MealService;

@SpringBootApplication
public class MealApplication implements CommandLineRunner {

	@Autowired
	MealService mealService;
	
	public static void main(String[] args) {
		
		SpringApplication.run(MealApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Meal> initialMeals = new ArrayList<>(Arrays.asList(
							new Meal(123,"Dinner",true,"South Indian"),
							new Meal(92,"Breakfast",true,"Omellete"),
							new Meal(225,"Lunch",false,"Roti Sabzi")
									));
		
		for(Meal meal : initialMeals) {
			mealService.addMeal(meal);
		}	
	}

}
