//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        
        //set up scanner. 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = scanner.nextLine();

                           
        //add new a line before asking next question. 
        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        
        //Pick up user's home and store it. 
        String address = scanner.nextLine();



        //add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + address + "! I'm from a place called Oracle.");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.

        int age = scanner.nextInt();

        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        System.out.println("Enough about me. What's your favorite language? (just don't say Python)");
        //Pick up language and store it. 
        
        scanner.nextLine(); //throwaway next line needed after using nextInt
        String language = scanner.nextLine();

        //add new a line here.
        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        //close scanner. 
        scanner.close();

        
    }
}
