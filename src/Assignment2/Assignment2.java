package Assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double num1 = numbers.nextDouble();
        System.out.print("Enter Second Number : ");
        double num2 = numbers.nextDouble();
        System.out.println("Sum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Product = " + (num1 * num2));
        System.out.println("Quotient = " + (num1 / num2));
    }
}
