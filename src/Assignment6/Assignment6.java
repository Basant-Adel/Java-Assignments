package Assignment6;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Enter The Number Of Students : ");
        int numStudents = inputUser.nextInt();

        inputUser.nextLine();

        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\nStudent " + i + " :");

            System.out.print("Enter student's name : ");
            String name = inputUser.nextLine();

            double[] scores = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter score " + (j + 1) + ": ");
                scores[j] = inputUser.nextDouble();
            }

            inputUser.nextLine();

            double average = calculateAverage(scores);
            char grade = determineGrade(average);

            System.out.println("Name: " + name);
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
        }

        inputUser.close();
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static char determineGrade(double average) {
        if (average >= 85) {
            return 'A';
        } else if (average >= 70) {
            return 'B';
        } else if (average >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
