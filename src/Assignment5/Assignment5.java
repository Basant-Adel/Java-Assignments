package Assignment5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // /////////////////// Print Numbers From 1 To 10 ///////////////////

        System.out.println("Numbers From 1 To 10: ");
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // /////////////////// Evan Or Odd ///////////////////

        System.out.print("Evan Or Odd ? Enter Your Number : ");

        int number = inputScanner.nextInt();
        if (number % 2 == 0){
            System.out.println("Evan Number");
        } else {
            System.out.println("Odd Number");
        }

        // /////////////////// Name Of The Day ///////////////////

        System.out.print("Choose Number from 1 to 7, What Is The Day Name ? ");

        int day = inputScanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // /////////////////// Multiplication Table ///////////////////

        System.out.print("Enter a number to print its multiplication table: ");

        int num = inputScanner.nextInt();
        for (int z = 1 ; z <= 10 ; z++) {
            System.out.println(num + " X " + z + " = " + num * z );
        }

        // /////////////////// Count Digits In A Number ///////////////////

        System.out.print("Enter a number to count its digits: ");

        int digitNum = Math.abs(inputScanner.nextInt());

        int count = 0;
        if (digitNum == 0){
            count = 1;
        }
        while (digitNum != 0) {
            digitNum /= 10;
            count++;
        }

        System.out.println("Number Of Digits : " + count);

        // /////////////////// Reverse A Number ///////////////////

        System.out.print("Enter Numbers To Reverse It : ");

        int reverseNum = Math.abs(inputScanner.nextInt());
        int reversed = 0;

        while (reverseNum != 0) {
            int digit = reverseNum % 10;
            reversed = reversed * 10 + digit;
            reverseNum /= 10;
        }

        System.out.println("Reversed Number : " + reversed);

        inputScanner.close();
    }
}