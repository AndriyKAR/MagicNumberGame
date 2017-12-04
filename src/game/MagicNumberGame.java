package game;

import java.util.Random;
import java.util.Scanner;

public class MagicNumberGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int magicNumber = random.nextInt(101);
        int userGuess ;
        int counter = 1;
        int maxAttempts = 10;

        System.out.println("Try to guess number from 0 to 100 ");
        System.out.println("You have only " + maxAttempts + " attempts ");

        do {

            if (counter <= maxAttempts) {
                System.out.println("\nTrying - " + counter);
                System.out.print("Guess Magic Number: ");
                userGuess = input.nextInt();


                if (userGuess == magicNumber) {
                    System.out.println("You are winner");
                    System.out.println("Total trying - " + counter);
                    break;}

                if (userGuess < magicNumber) {
                    counter++;
                    System.out.println("You enter to small number");
                }
                else if (userGuess > magicNumber) {
                    counter++;
                    System.out.println("You enter to big number");
                }
                else {
                    System.out.println("You used all attempts.");
                    System.out.println("Magic number was: " + magicNumber);
                    break;
                }
            }
        } while (true);


        int totalPayout = 0;
        int payout = 200;
        int prizeCounter;

        if (userGuess == magicNumber) {
            prizeCounter = maxAttempts - counter;
            totalPayout = prizeCounter * payout;
        }
        System.out.println("Your payout  - " + totalPayout + " $ ");
        System.out.println("Magic number - " + magicNumber);
    }

    public static void menu() {

    }

    public static void checkNumber (int userNumber) {

    }

    public static void setBet () {


    }


}
