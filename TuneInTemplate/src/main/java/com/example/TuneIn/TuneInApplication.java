package com.example.TuneIn;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TuneInApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch User details from Console.
		3. Get the required bean from context.
		4. Get the songs from Console and add them to the playlist
		5. Display the playlist reference Id
		6. Display the list of songs with their reference Id
		 */
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Scanner s = new Scanner(System.in);
    	User user = (User) context.getBean("myUser");
    	System.out.println("Welcome to Music Playlist Application");
    	System.out.println("What is your name?");
    	String userName = s.nextLine();
    	System.out.println("What is your age?");
    	int userAge = s.nextInt();
    	user.setUserDetail(userName, userAge);
    	Playlist playlist = user.getPlaylist();
    	while(true) {
    		System.out.println("Do you want to add Songs to the playlist\n1. Yes\n2.No");
    		int input = s.nextInt();
    		if(input == 1) {
    			System.out.println("Enter name of the song");
    			String songName = s.next();
    			Song song = (Song) context.getBean("mySong");
                song.setName(songName);
                playlist.addSong(song);
    		}else {
    			break;
    		}
    	}
    	System.out.println("Your Playlist with reference Id: " + playlist + " is Ready!");
        for (Song song : playlist.getPlaylistSongs()) {
            System.out.println("Song name: " + song.getSongName()  + "    " + "Reference Id: " + song);
        }
        context.close();
        s.close();
    }

}
