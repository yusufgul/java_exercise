package yusuf.com;

import java.util.Scanner;

public class repeatingNumbers {

  public static void findRepeaters(int[] numbers) {
    int lastDup = 0;
    int prevDup = 0;
    boolean flag = false;

    intArrayOp.SmallToBig(numbers); //put numbers in order before checking

    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] == numbers[i - 1]) { //check if two adjacent numbers are same
        if (flag == true) { //avoid this block at first run, return when there is first duplicate number
          lastDup = numbers[i];
          if (lastDup != prevDup) { //to prevent printing numbers multiple time when numbers are repeated more than two times
            System.out.println("Duplicate: " + numbers[i]);
            prevDup = lastDup;
          }
        }

        if (flag == false) {
          prevDup = numbers[i];
          flag = true;
          System.out.println("Duplicate: " + numbers[i]);
        }
      } //end of outer if loop
    } //end of for loop
  } //end of findRepeaters method

  public static boolean repeat() {
    Scanner sc = new Scanner(System.in);
    char playAgain = 'n';
    boolean end = false;

    System.out.println("Do you want to play again?(y/n): \n");
    playAgain = sc.next().charAt(0);
    if (playAgain == 'n') {
      System.out.println("\nThe program has been terminated successfully.");
      System.out.println("\nNow returning to the main menu...");
      end = true;
    }

    return end;
  } //end of repeat method

  public static void selection() {
    boolean end = false;

    while (!end) {
      System.out.println(
        "Do you want to use pre-determined array or enter a new array to check for repeating numbers?: "
      );
      System.out.println(
        "1- Pre-determined array : [1,2,5,9,8,11,5,2,4,5,7,12]."
      );
      System.out.println("2- Enter a new array.\n");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();

      switch (number) {
        case 1:
          {
            int[] numbers = { 1, 2, 5, 9, 8, 11, 5, 2, 4, 5, 7, 12 };
            findRepeaters(numbers);
            end = repeat();
            break;
          }
        case 2:
          {
            int[] numbers = intArrayOp.getArray();
            findRepeaters(numbers);
            end = repeat();
            break;
          }
        default:
          System.out.println("Please enter a valid number.");
          break;
      } //end of switch case block
    } //end of while loop
  } //end of selection method
} //end of repeatingNumbers class
