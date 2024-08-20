package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
  This class is an implementation of a Ingredients Interface based on the selection 
  done in the console for the ingredient.You need to complete this class based on
  the following tasks.
    
    Tasks:
        1. Override the methods of Ingredients Interface.
        2. Create the constructor for this class and add your choice of ingredients in the list based on
           the type of recipe for example

                  public Rice() {
                    Collections.addAll(southIndianRiceRecipes, "Rice", "Salt", "Black Gram");
                    }
 */


public class Rice implements Ingredients {
  
  /** Given below are the 3 booleans based on the recipe type.These booleans bydefault will be false however
    based on recipe type selected ( setIngredient(String ingredient) ) this boolean will become true accordingly.
  **/

    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

 /** Given below are 3 ArrayList which are used to store the ingredients of your choice based 
     on the recipe type.Refer to point number 2 above.
 **/
    private List<String> chineseRiceRecipes = new ArrayList<String>();
    private List<String> northIndianRiceRecipes = new ArrayList<String>();
    private List<String> southIndianRiceRecipes = new ArrayList<String>();
	
	public Rice() {
		// Initializing ingredient lists with some ingredients based on recipe type
        Collections.addAll(chineseRiceRecipes, "Steamed Rice", "Ginger", "Garlic", "Soy Sauce", "Soy Sauce");
        Collections.addAll(northIndianRiceRecipes, "Rice", "Water", "Salt", "Butter");
        Collections.addAll(southIndianRiceRecipes, "Rice", "Salt", "Mustard Seeds", "Black Gram");
    }
    
	@Override
	public void setIngredient(String ingredient) {
		// TODO Auto-generated method stub
		if (ingredient.equalsIgnoreCase("Chinese")) {
            isChinese = true;
        } else if (ingredient.equalsIgnoreCase("NorthIndian")) {
            isNorthIndian = true;
        } else if (ingredient.equalsIgnoreCase("SouthIndian")) {
            isSouthIndian = true;
        }
		
	}
	@Override
	public String getDishDetail() {
		// TODO Auto-generated method stub
		if (isChinese) return "Chinese Lentil Soup";
        if (isNorthIndian) return "North Indian Dal";
        if (isSouthIndian) return "South Indian Sambar";
        return "";
	}
	@Override
	public List<String> getIngredientsDetail() {
		// TODO Auto-generated method stub
		if (isChinese) return chineseRiceRecipes;
        if (isNorthIndian) return northIndianRiceRecipes;
        if (isSouthIndian) return southIndianRiceRecipes;
        return new ArrayList<>();
	}
}
