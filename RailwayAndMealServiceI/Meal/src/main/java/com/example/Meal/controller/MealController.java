package com.example.Meal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Meal.Entity.Meal;
import com.example.Meal.service.MealService;



@RestController
@RequestMapping("/pantry")
class MealController {
	
	@Autowired
	private MealService mealService;	
	
	
	@GetMapping("/meals")
	public List<Meal> getMeals(){
		return mealService.getMeals();
	}
	
	@GetMapping("/meal/{pnr}")
	public Meal getSingleMeal(@PathVariable long pnr) {
		System.out.println(mealService.getMealByPnr(pnr).getPnr());
		return mealService.getMealByPnr(pnr);
	}
	
	
	@PostMapping("/meal")
	public void addMeal(@RequestBody Meal meal) {
		System.out.println(meal.getPnr());
		mealService.addMeal(meal);
	}

	
	@PutMapping("/meal/{pnr}")
	public void updateMeal(@RequestBody Meal meal,@PathVariable long pnr) {
		mealService.updateMeal(meal,pnr);
	}

	
	@DeleteMapping("/meal/{pnr}")
	public void deleteMeal(@PathVariable long pnr) {
		mealService.deleteMeal(pnr);
	}

}
