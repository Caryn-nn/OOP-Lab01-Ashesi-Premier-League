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

        // Converting weight to kilograms and height to centimeters
        double convertWeightToKilograms = weight * POUND;
        double convertHeightToCentimeters = height * METER;


        // type casting double variables to integers
        int weightInKg = (int) convertWeightToKilograms;
        int heightInCm = (int) convertHeightToCentimeters;

        // checking if player is eligible to play
        if (age >= 18 && age <= 35 && weight < 90) {
            Eligibility = "Eligible";
        } else {
            Eligibility = "Not eligible";
        }

        // categorizing players by age
        if (age <= 20) {
            Category = "RisingStar";
        } else if (30 >= age) {
            Category = "Prime PLayer";
        } else {
            Category = "Veteran";
        }


        // assigning position based on jersey number
        switch (jerseyNumber) {
            case 1:
                Position = "Goalkeeper";
                break;

            case 2:
            case 5:
                Position = "defender";
                break;

            case 6:
            case 8:
                Position = "midfielder";
                break;

            case 9:
                Position = "striker";
                break;

            case 10:
                Position = "Playmaker";
                break;

            case 11:
                Position = "Winger";
                break;

            default:
                Position = "Player position not known";

        }

        // checking attacker status
        if(jerseyNumber == 6 || jerseyNumber==8 || jerseyNumber==9 || jerseyNumber==11){
            attackerJersey = "Yes";
        } else{
            attackerJersey = "No";
        }

        //making a lineup decision
        if (age >= 20 && age <= 30) {
            if (weight < 80) {
                lineupDecision = "Lineup";
            }
        } else {
            lineupDecision = "bench";
        }

        // Determining the final Decision of the player
        finalDecision = (Eligibility.equals("Eligible")) ? "Play" : "Rest";








    }
}
