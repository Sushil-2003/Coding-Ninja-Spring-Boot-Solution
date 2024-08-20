package com.example.TastyTrove;

/**
 
  This class is an implementation of a Recipe Interface based on the selection 
  done in the console for Recipe type.You need to complete this class 
  based on the following tasks.
   
    Tasks:
  a. Override the methods of Recipe Interface.
  b. Add common attributes:
      1. String name
      2. String userName
      3. Ingredients ingredients
  c. Build the logic for all the methods based on the description mentioned in the Recipe Interface.
  d. Create a setter injection mentioned named as "setIngredients(Ingredients ingredients)" this method 
     injects the "ingredient" attribute as  a dependency into this class using Setter Injection approach.
     
**/

public class NorthIndian implements Recipe {

	 public String name = "North Indian Dal Makhni";
     public String userName;
     Ingredients ingredients;
     
 	 public void setIngredients(Ingredients ingredients) {
 	 	this.ingredients = ingredients;
 	 } 
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Hello user " + userName + ", we suggest you make " + name + " you can use the following ingredients:");
        for (String ingredient : ingredients.getIngredientsDetail()) {
            System.out.println(ingredient);
        }
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

}
