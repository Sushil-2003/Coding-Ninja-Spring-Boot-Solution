package com.example.TastyTrove;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class TastyTroveApplication {

	public static void main(String[] args) {
		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.
		
		1. Fetch context from ApplicationContext.xml and initiate Scanner
		2. Fetch User details from Console
		3. Fetch Recipe selection from User
		4. Fetch Ingredient Selection
		5. Get the required bean from context.
		6. Set user's name and display the recipe details
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Tasty Trove Application");
		while (true) {
			System.out.println("Enter your name?");
			String userName = scanner.next();
			System.out.println("Select Recipe:");
			System.out.println("1. North Indian\n2. South Indian\n3. Chinese");
			String recipeBeanid = "";
			int recipeChoice = scanner.nextInt();
			scanner.nextLine();
			switch (recipeChoice) {
				case 1 -> recipeBeanid = "northIndian";
				case 2 -> recipeBeanid = "southIndian";
				case 3 -> recipeBeanid = "Chinese";
				default -> {
					System.out.println("Invalid choice.");
					return;
				}
			}
			System.out.println("Select Ingredients:\n1. Lentils\n2. Rice\n3. Wheat");
			int ingredientsChoice = scanner.nextInt();
			scanner.nextLine();
			String ingredientsBeanid = ""; //name
			switch (ingredientsChoice) {
				case 1 -> ingredientsBeanid = "lentils";
				case 2 -> ingredientsBeanid = "rice";
				case 3 -> ingredientsBeanid = "wheat"; 
				default -> {
					System.out.println("Invalid choice.");
					return;
				}
			}
			Recipe recipe = (Recipe) context.getBean(recipeBeanid);
            Ingredients ingredients = (Ingredients) context.getBean(ingredientsBeanid);

            ingredients.setIngredient(recipeBeanid);
            recipe.setIngredients(ingredients);
            recipe.setUserName(userName);
            recipe.getDetails();
			
		}
	}

}