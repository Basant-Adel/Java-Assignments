package Assignment4;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner votingEligibility = new Scanner(System.in);

        System.out.print("Enter Your Age : ");
        int age = votingEligibility.nextInt();

        votingEligibility.nextLine();

        System.out.print("Enter Your Nationality : ");
        String userNationality = votingEligibility.nextLine().toLowerCase();
        System.out.println(userNationality.substring(0, 1).toUpperCase());
        System.out.println(userNationality.substring(1));

        String firstCharacterUpper = userNationality.substring(0, 1).toUpperCase();
        String restOfWordLower = userNationality.substring(1);

        String AllWordUserNationality = firstCharacterUpper + restOfWordLower;

        System.out.println(AllWordUserNationality);

        String nationality = "Egyptian";

        if (age >= 18 && AllWordUserNationality.equals(nationality)){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible");
        }

        votingEligibility.close();
    }
}