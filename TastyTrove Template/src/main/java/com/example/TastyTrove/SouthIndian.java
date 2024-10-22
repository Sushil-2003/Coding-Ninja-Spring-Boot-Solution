package com.example.TastyTrove;

import com.example.TastyTrove.Ingredients;
import com.example.TastyTrove.Recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SouthIndian implements Recipe {
    private String name ="SouthIndian";
    private String userName;
    private Ingredients ingredients;
    @Autowired
    @Qualifier("rice")
    private Ingredients rice;
    @Autowired
    @Qualifier("lentils")
    private Ingredients lentils;
    @Autowired
    @Qualifier("wheat")
    private Ingredients wheat;

    @Override
    public void setUserName(String name) {
        this.userName = name;
    }

    @Override
    public void getDetails() {
        this.ingredients.setIngredient(name);
        String dishName = this.ingredients.getDishDetail();
        List<String> ingredients = this.ingredients.getIngredientsDetail();
        System.out.println("Hello user " + this.userName + " we suggest you to make " + dishName + " you can use the following ingredients:");
        System.out.println("Ingredients:");
        for(int i = 0; i < ingredients.size(); i++){
            System.out.println(i + 1 + ". " + ingredients.get(i));
        }
    }

	@Override
	public void setIngredients(String ingredients) {
		// TODO Auto-generated method stub
		if(ingredients.equals("Rice")) {
			this.ingredients = rice;
		}else if(ingredients.equals("Wheat")) {
			this.ingredients = wheat;
		}else {
			this.ingredients = lentils;
		}
	}
}
