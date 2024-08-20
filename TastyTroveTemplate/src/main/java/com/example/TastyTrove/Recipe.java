package com.example.TastyTrove;

public interface Recipe {

    /** The method prints the following message on the console 
       "Hello user John we suggest you to make Chinese Fried Rice you can use the following ingredients:
         1. Steamed Rice
         2. Ginger
         3. Garlic
         4. Soy Sauce
         5. Vinegar".
        The above message contains the username, dishName, and lastly the list of suggested ingredients based on the type of recipe selected by the user.
    **/
    void getDetails();

    /** This method sets the username. **/
    void setUserName(String userName);
    void setIngredients(Ingredients ingredients);
}





