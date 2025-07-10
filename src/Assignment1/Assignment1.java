package Assignment1;

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
    }
}
