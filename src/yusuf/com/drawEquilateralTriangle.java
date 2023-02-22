package yusuf.com;

import java.util.Scanner;

public class drawEquilateralTriangle {

  public static void drawTriangle() {
    boolean end = false;

    while (!end) {
      int i = 1, number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      number = sc.nextInt();

      for (int k = 1; k <= number; k++) {
        for (int j = 1; j <= number - i; j++) {
          System.out.print(" ");
        }
        for (i = 1; i <= k; i++) {
          System.out.print(k + " ");
        }
        System.out.println("");
      } //end of outer for method
      end = repeat();
    } //end of while method
  } //end of drawTriangle method

  public static boolean repeat() {
    Scanner sc = new Scanner(System.in);
    char playAgain = 'n';
    boolean end = false;

    System.out.println("\nDo you want to draw another triangle?(y/n): ");
    playAgain = sc.next().charAt(0);

    if (playAgain == 'n') { //user wants to quit
      System.out.println("\nThe program has been terminated successfully.");
      System.out.println("\nNow returning to the main menu...");
      end = true;
    } //end of if loop
    return end;
  } //end of repeat method
} //end of drawEquilateralTriangle class
