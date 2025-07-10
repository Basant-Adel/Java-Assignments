package Assignment3;

import java.util.Scanner;

public class Assignment3 {
     public static void main(String[] args) {
        Scanner stringFun = new Scanner(System.in);
        System.out.print("Enter a Sentence : ");
        String sentence = stringFun.nextLine().trim();
        if (sentence.isEmpty()) {
            System.out.println("You didn't enter any thing!");
        } else {
            System.out.println("Uppercase: " + sentence.toUpperCase());
            System.out.println("Length: " + sentence.length());
            System.out.println("First Character: " + sentence.charAt(0));
        }
        stringFun.close();
     }
}
