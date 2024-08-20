package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lentils implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseLentilsRecipes = new ArrayList<String>();
    private List<String> northIndianLentilsRecipes = new ArrayList<String>();
    private List<String> southIndianLentilsRecipes = new ArrayList<String>();

    public Lentils() {
        Collections.addAll(chineseLentilsRecipes, "Soy Sauce", "Sesame Oil", "Onion", "Ginger");
        Collections.addAll(northIndianLentilsRecipes, "Spices", "Lentils", "Cooking Oil", "Onions", "Garlic");
        Collections.addAll(southIndianLentilsRecipes, "Turmeric", "Lentils", "Mustard Seed", "Salt");
    }

    @Override
    public void setIngredient(String ingredient) {
        if(ingredient.equals("Chinese")) this.isChinese = true;
        if(ingredient.equals("NorthIndian")) this.isNorthIndian = true;
        if(ingredient.equals("SouthIndian")) this.isSouthIndian = true;
    }

    @Override
    public String getDishDetail() {
        if(isNorthIndian) return "Curry";
        else if(isSouthIndian) return "Sambhar";
        else return "Bulgogi";
    }

    @Override
    public List<String> getIngredientsDetail(){
        if(isNorthIndian) return northIndianLentilsRecipes;
        else if(isSouthIndian) return southIndianLentilsRecipes;
        else return chineseLentilsRecipes;
    }
}
