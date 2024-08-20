package com.sushil3.SocialMediaApplication;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SocialMediaApplication.class, args);
		// get the context from the xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Post post = (Post) context.getBean("simplePost");

		User user = (User) context.getBean("simpleUser");
		// prompt the user
		System.out.println("Social media app! start");
		
		// setup scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String userName = scanner.nextLine();
		user.setUserName(userName);
		
		// infinite loop
		while(true) {
			// fetch a post list;
			//PostList postList = (PostList)context.getBean("simplePostList");
			PostList postList = user.getPostList();
			System.out.println("the reference of post list "+ postList.toString());
			
			
			// prompt user for different options
			System.out.println("1) make new post \n2)show all posts \n3)exit");
			int menuItem = scanner.nextInt();
			switch (menuItem) {
			case 1: {
				Post post = (Post)context.getBean("simplePost");
				System.out.println("please enter a post");
				scanner.nextLine(); // getting the \n and moving to the next input 
				String message = scanner.nextLine();
				post.setMessage(message);
				postList.setPost(post);
				break;
			}
            case 2: {
            	System.out.println("All the posts !");
            	for(int i = 0;i<postList.size();i++) {
            		System.out.println("the ref of post "+postList.getPost(i).toString());
            		System.out.println(i+") " + user.getUserName() + " " + postList.getPost(i).getMessage());
            	}
            	break;
			}
            case 3: {
				break;
			}
			default:
				System.out.println("error");
			}
			if(menuItem == 3) {
				break;
			}
		}
		scanner.close();
		context.close();
	}
}