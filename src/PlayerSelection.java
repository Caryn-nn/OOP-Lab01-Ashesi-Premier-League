// Author: Fafali Caryn Aku Awittor
// Date: 9th September, 2025
// Description: Building a complete program to help coach of the Ashesi Premier League make decision about the player eligibility,position and lineup

// importing the scanner package to allow input
import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {

        //declaring variables with their appropriate data types
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        String Category;
        String lineupDecision = "";
        String Eligibility;
        String Position;
        String finalDecision;
        String attackerJersey;

        //Accepting input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = input.nextLine();

        System.out.print("Enter Age: ");
        age = input.nextInt();

        System.out.print("Enter Height(in metres): ");
        height = input.nextDouble();

        System.out.print("Enter Weight(in pounds): ");
        weight = input.nextDouble();

        System.out.print("Enter Jersey Number: ");
        jerseyNumber = input.nextInt();

        input.close();


        // declaring constant variables
        final double POUND = 0.45359237;
        final int METER = 100;




    }
}
