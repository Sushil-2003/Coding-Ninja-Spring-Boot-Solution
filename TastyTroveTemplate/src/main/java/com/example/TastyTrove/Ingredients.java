package com.example.TastyTrove;

import java.util.List;

public interface Ingredients {

    /** This method sets ingredient flags (isChinese, isNorthIndian, isSouthIndian) based on the type of recipe and ingredient selected by the user.for
        reference you could see the implementation in the screenshot provided in the problem statment.**/
    void setIngredient(String ingredient);

    /** This method returns a dish name in string format based on the ingredient flags (isChinese, isNorthIndian, isSouthIndian).for
        reference you could see the implementation in the screenshot provided in the problem statment. **/
    String getDishDetail();

    /** This method returns ingredientList of type String based on the ingredient flags.for
        reference you could see the implementation in the screenshot provided in the problem statment. **/
    List<String> getIngredientsDetail();
}

