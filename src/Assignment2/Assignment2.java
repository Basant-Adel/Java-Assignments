package Assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double num1 = numbers.nextDouble();

        System.out.print("Enter Second Number : ");
        double num2 = numbers.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        if (num2 == 0) {
            System.out.println("You can't divide by zero!");
        } else {
            double quotient = num1 / num2;
            System.out.println("Quotient = " + quotient);
        }
    }
}
