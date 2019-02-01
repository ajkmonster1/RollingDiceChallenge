import java.util.Random;
import java.util.Scanner;

public class RollingDiceChallenge {

    public static void main(String[] args) {
        int sum;
        String roll;
        int sum1 = 0;
        System.out.println("Welcome! Let's play dice!" + "\n" +
                "Here we are going to roll two dices and add the sum till we reach 100." + "\n"
                + "Double 1's get you 25 and only one 1 forfeits your score for the round." + "\n" +
                "Best of luck!" + "\n");
        do {

            Random randomGenerator1 = new Random();
            Random randomGenerator3 = new Random();
            int randomValue2 = 1 + randomGenerator1.nextInt(6);
            int randomValue3 = 1 + randomGenerator3.nextInt(6);
            System.out.println("Your roll: " + randomValue2 + " and " + randomValue3);
            if (randomValue2 == 1 && randomValue3 == 1) {
                sum = 25;
                sum1 = sum + sum1;
                System.out.println("Your sum: " + sum1);
            } else if (randomValue2 == 1 || randomValue3 == 1) {
                sum = 0;
                sum1 = sum + sum1;
                System.out.println("Your sum: " + sum1);
            } else {
                sum = randomValue2 + randomValue3;
                sum1 = sum + sum1;
                System.out.println("Your sum: " + sum1);
            }
            Scanner input1 = new Scanner(System.in);
            System.out.print("Would you like to roll again? (Y/N):");
            roll = input1.next();
            if (sum1 >= 100) {
                System.out.println("Congrats! You scored 100 or more.");
                break;
            }
        } while (!roll.equalsIgnoreCase("N"));
        System.out.println("Thanks for playing!");


    }
}

