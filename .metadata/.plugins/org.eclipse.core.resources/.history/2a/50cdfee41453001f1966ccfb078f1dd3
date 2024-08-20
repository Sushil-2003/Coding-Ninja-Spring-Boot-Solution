package com.example.TastyTrove;

import com.example.TastyTrove.Ingredients;
import com.example.TastyTrove.Recipe;

import java.util.List;

public class NorthIndian implements Recipe {
    private String name = "NorthIndian";
    private String userName;
    private Ingredients ingredients;

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

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
        for(int i = 0; i < ingredients.size(); i++){
            System.out.println(i + 1 + ". " + ingredients.get(i));
        }
    }
}
