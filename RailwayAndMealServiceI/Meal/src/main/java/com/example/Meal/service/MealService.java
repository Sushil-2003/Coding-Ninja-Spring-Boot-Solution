package com.example.Meal.service;


import com.example.Meal.Entity.Meal;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import com.example.Meal.exception.MealWithPnrAlreadyExists;
import com.example.Meal.exception.MealNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class MealService {
	
	public List<Meal> list = new ArrayList<>();
	
	public List<Meal> getMeals() {
		return list;
	}	
	
	public Meal getMealByPnr(long pnr) {
		if(ObjectUtils.isEmpty(getMealfromList(pnr))) {
			throw new MealNotFoundException("meal with given pnr " + pnr + " does not exist.");
		}
		return getMealfromList(pnr);
	}
	
	public void addMeal(Meal meal) {
		long pnr = meal.getPnr();
		
		if(!ObjectUtils.isEmpty(getMealfromList(pnr)))
			deleteMeal(meal.getPnr());
			
		list.add(meal);
	}
	
	public void deleteMeal(long pnr) {
		
		if(ObjectUtils.isEmpty(getMealfromList(pnr))) {
			System.out.println("Meal with given Pnr does not exist");
			throw new MealNotFoundException("Meal with given Pnr does not exist");
		}
		
		Meal meal = this.getMealfromList(pnr);
		list.remove(meal);
	}
	
	
	public void updateMeal(Meal meal, long pnr) {
		if(ObjectUtils.isEmpty(getMealfromList(pnr))) {
			System.out.println("Meal with given Pnr does not exist");
			throw new MealNotFoundException("Meal with given Pnr does not exist");
		}
		
		this.deleteMeal(pnr);
		this.addMeal(meal);
		
	}
	
	public Meal getMealfromList(Long pnr) {
		for(Meal meal: list) {
			if(meal.getPnr() == pnr)
				return meal;
		}
		
		return null;
	}
}
