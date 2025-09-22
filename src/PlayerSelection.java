// Author: Fafali Caryn Aku Awittor
// Instructor : Daniel Addo
// Class : OOP Lab 1 (Cohort A)
// Date: 22th September, 2025
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
        String category;
        String lineupDecision;
        String eligibility;
        String position;
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
        if (age >= 18 && age <= 35 && weightInKg < 90) {
            eligibility = "Eligible";
        } else {
            eligibility = "Not eligible";
        }


        // categorizing players by age
        if (age <= 20) {
            category = "Rising Star";
        } else if (age <= 30) {
            category = "Prime PLayer";
        } else {
            category = "Veteran";
        }


        // assigning position based on jersey number
        switch (jerseyNumber) {
            case 1:
                position = "Goalkeeper";
                break;

            case 2:
            case 5:
                position = "Defender";
                break;

            case 6:
            case 8:
                position = "Midfielder";
                break;

            case 9:
                position = "Striker";
                break;

            case 10:
                position = "Playmaker";
                break;

            case 7:
            case 11:
                position = "Winger";
                break;

            default:
                position = "Player position not known";

        }


        // checking attacker status
        if(jerseyNumber == 7 || jerseyNumber==9 || jerseyNumber==10 || jerseyNumber==11){
            attackerJersey = "Yes";
        } else{
            attackerJersey = "No";
        }


        //making a lineup decision
        if (age >= 20 && age <= 30) {
            if (weightInKg < 80) {
                lineupDecision = "Lineup";
            } else {
                lineupDecision = "Bench";
            }

        } else {
            lineupDecision = "Bench";
        }


        // Determining the final decision of the player
        finalDecision = (eligibility.equals("Eligible")) ? "Play" : "Rest";


        // Printing final user information
        System.out.println();
        System.out.println("Player Report");
        System.out.println("Player Name : [" + name + "]");
        System.out.println("Age : [" + age + "] [" + category + "]");
        System.out.println("Height : [" + heightInCm + " cm] ");
        System.out.println("Weight : [" + weightInKg + " kg] ");
        System.out.println("Jersey Number : [" + jerseyNumber + "] ");
        System.out.println("Position : [" + position + "]");
        System.out.println("Attacker jersey : [" + attackerJersey + "] ");
        System.out.println("Eligibility : [" + eligibility + "]");
        System.out.println("Lineup Decision : [" + lineupDecision + "]");
        System.out.println("Final Decision : [" + finalDecision + "]");


    }

}











