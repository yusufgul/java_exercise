package yusuf.com;

import java.util.Random;
import java.util.Scanner;

public class numberGuessing {

  public static char repeat() {
    Scanner sc = new Scanner(System.in);
    char playAgain = 'n';

    System.out.println("Do you want to play again?(y/n): \n\n");
    playAgain = sc.next().charAt(0);

    if (playAgain == 'n') {
      System.out.println("\nThe program has been terminated successfully.");
      System.out.println("\nNow returning to the main menu...");
    } //end of if

    return playAgain;
  } //end of repeat method

  public static void numberGuessingGame() {
    char playAgain = 'n';

    do {
      Random rand = new Random();
      int int_random = rand.nextInt(21);
      System.out.println(
        "The program has specified a random number between 0 and 20.\nYou have 5 attempts to guess this number.\n"
      );
      boolean end = false;
      int number, counter = 0;

      while (!end) {
        System.out.print("Please guess a number between 0 and 20: \n\n");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number >= 0 && number <= 20) { //check if input is in the acceptable range
          if (number == int_random) {
            System.out.println(
              "\n*******************************************************************************"
            );
            System.out.println(
              "Congratulations! You guessed the number correctly at your " +
              (counter + 1) +
              ". try!"
            );
            System.out.println(
              "*******************************************************************************\n\n"
            );
            end = true;
            playAgain = repeat();
          }
          if (number < int_random) {
            counter++;
            if (counter != 5) System.out.println(
              "Tyr again! Hint: Number is BIGGER than your guess.\n"
            );
          }
          if (number > int_random) {
            counter++;
            if (counter != 5) System.out.println(
              "Tyr again! Hint: Number is SMALLER than your guess.\n"
            );
          }
          if (counter == 5) {
            System.out.println(
              "\nYou FAILED! It was " +
              int_random +
              "! The number was " +
              int_random +
              " all along!\n"
            );
            end = true;
            playAgain = repeat();
          }
        } //end of if loop
      } //end of while loop
    } while (playAgain == 'y'); //end of do while loop
  } //end of numberGuessingGame method
} //end of numberGuessing class
