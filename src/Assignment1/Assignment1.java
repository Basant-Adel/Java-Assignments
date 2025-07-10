package Assignment1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        String firstName = "Basant";
        String lastName = "Adel";
        String fullName = firstName + " " + lastName;
        int age = 24;
        int ageInMonths = age * 12;
        String favoriteLanguage = "Java";

        System.out.println("Hello! My name is " + fullName + ".");
        System.out.print("I am " + age + " years old,");
        System.out.println(" which is " + ageInMonths + " months.");
        System.out.println("My favorite programming language is " + favoriteLanguage + ".");

        age++;
        System.out.println("Next year I will be " + age + " years old.");
        System.out.println(" ");

        // Another Solve

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Full Name: ");
        String userFullName = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int userAge = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Your Favorite Programming Language: ");
        String userFavoriteLanguage = scanner.nextLine();

        int userAgeInMonths = userAge * 12;

        System.out.println("\nHello! My name is " + userFullName + ".");
        System.out.println("I am " + userAge + " years old, which is " + userAgeInMonths + " months.");
        System.out.println("My favorite programming language is " + userFavoriteLanguage + ".");

        userAge++;
        System.out.println("Next year I will be " + userAge + " years old.");

        scanner.close();
    }
}
