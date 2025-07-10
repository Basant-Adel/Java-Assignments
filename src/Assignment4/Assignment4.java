package Assignment4;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner votingEligibility = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = votingEligibility.nextInt();

        votingEligibility.nextLine();

        System.out.print("Enter Your Nationality : ");
        String nationality = votingEligibility.nextLine().trim().toLowerCase();
        String formattedNationality = nationality.substring(0, 1).toUpperCase() + nationality.substring(1);

        if (age >= 18 && formattedNationality.equals("Egyptian")){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }

        votingEligibility.close();
    }
}