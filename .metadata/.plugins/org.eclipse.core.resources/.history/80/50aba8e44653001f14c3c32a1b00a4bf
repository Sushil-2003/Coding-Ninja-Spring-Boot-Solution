package com.example.TastyTrove;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class TastyTroveApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Welcome to Tasty Trove Application");

		// Enter User details
		System.out.println("Enter your name?");
		String name = scanner.nextLine();

		//Recipe Selection
		System.out.println("Select Recipe:");
		System.out.println("1. North Indian");
		System.out.println("2. South Indian");
		System.out.println("3. Chinese");
		String recipeType = "";

		int recipeTypeChoice = scanner.nextInt();

		switch (recipeTypeChoice) {
			case 1 -> recipeType = "northIndian";
			case 2 -> recipeType = "southIndian";
			case 3 -> recipeType = "chinese";
			default -> {
				System.out.println("Invalid choice. Exiting...");
				System.exit(0);
			}
		}
		// Ingredient Selection
		String ingredientType = "";
		System.out.println("Select Ingredient:");
		System.out.println("1. Lentils");
		System.out.println("2. Rice");
		System.out.println("3. Wheat");
		int ingredientTypeChoice = scanner.nextInt();

		switch (ingredientTypeChoice) {
			case 1 -> ingredientType = "Lentils";
			case 2 -> ingredientType = "Rice";
			case 3 -> ingredientType = "Wheat";
			default -> {
				System.out.println("Invalid choice. Exiting...");
				System.exit(0);
			}
		}
		Recipe myRecipe = (Recipe) context.getBean(recipeType + ingredientType);
		myRecipe.setUserName(name);
		myRecipe.getDetails();
	}

}