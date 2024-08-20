package com.example.TuneIn;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class TuneInApplication {

    public static void main(String[] args) {
        // Context initialized
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("Welcome to Music Playlist Application");

        User user = (User) context.getBean("user");
        // Enter User details
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        user.setUserDetail(name, age);
        while (true) {
            System.out.println();
            System.out.println("Do you want to add Songs to the playlist \n1. Yes \n2. No");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 2) {
                break;
            } else {
                System.out.println("Enter name of the song");
                String songName = scanner.nextLine();
                Song song = (Song) context.getBean("song");
                song.setName(songName);
                user.getPlaylist().addSong(song);
            }
        }

        System.out.println("Your Playlist with reference Id: " + user.toString().substring(28, 36) + " is Ready!!");
        for (Song song : user.getPlaylist().getPlaylistSongs()) {
            System.out.println("Song name: " + song.getSongName() + "\t Reference Id: " + song.toString().substring(28, song.toString().length()));
        }

    }

}
