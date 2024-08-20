package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Wheat implements Ingredients {
    private boolean isChinese = false;
    private boolean isNorthIndian = false;
    private boolean isSouthIndian = false;

    private List<String> chineseWheatRecipe = new ArrayList<String>();
    private List<String> northIndianWheatRecipe = new ArrayList<String>();
    private List<String> southIndianWheatRecipe = new ArrayList<String>();

    public Wheat() {
        Collections.addAll(chineseWheatRecipe, "Wheat", "Water", "Sugar", "Yeast", "salt");
        Collections.addAll(northIndianWheatRecipe, "Onions", "Green Chillies", "Water", "Chana Dal");
        Collections.addAll(southIndianWheatRecipe, "Wheat", "Moong Dal", "Water", "salt");
    }

    @Override
    public void setIngredient(String ingredient) {
        if(ingredient.equals("Chinese")) this.isChinese = true;
        if(ingredient.equals("NorthIndian")) this.isNorthIndian = true;
        if(ingredient.equals("SouthIndian")) this.isSouthIndian = true;
    }

    @Override
    public String getDishDetail() {
        if(isNorthIndian) return "Upma";
        else if(isSouthIndian) return "Pongal";
        else return "Wheat Buns";
    }
    @Override
    public List<String> getIngredientsDetail(){
        if(isNorthIndian) return northIndianWheatRecipe;
        else if(isSouthIndian) return southIndianWheatRecipe;
        else return chineseWheatRecipe;
    }

}
