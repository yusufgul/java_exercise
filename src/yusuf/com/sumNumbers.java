package yusuf.com;

import java.util.Scanner;

public class sumNumbers {

  public static int addition(int num) {
    int remain, sum = 0;

    while (num > 0) {
      remain = num % 10;
      sum = sum + remain;
      num = num / 10;
    }
    return sum;
  } //end of addition method

  public static boolean repeat() {
    Scanner sc = new Scanner(System.in);
    char playAgain = 'n';
    boolean end = false;

    System.out.println("\nDo you want to make another addition?(y/n): ");
    playAgain = sc.next().charAt(0);
    if (playAgain == 'n') { //if user wants to quit
      System.out.println("\nThe program has been terminated successfully.");
      System.out.println("\nNow returning to the main menu...");
      end = true;
    }
    return end;
  } //end of repeat method

  public static void selection() {
    boolean end = false;
    int num;

    while (!end) {
      System.out.println(
        "Do you want to use already existing numbers or enter a new number to calculate?: "
      );
      System.out.println("1- Use these fancy numbers : 6588, 6587, 2211444.");
      System.out.println("2- Enter a new boring number: ");
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int[] array = { 6588, 6587, 2211444 }; //numbers given in homework

      switch (number) {
        case 1:
          {
            for (int i = 0; i < 3; i++) System.out.println(
              "Sum of digits for " + array[i] + " is : " + addition(array[i])
            );

            end = repeat(); //check if the user wants to repeat the operation
            break;
          }
        case 2:
          {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number : ");
            num = s.nextInt();
            System.out.println(
              "\nSum of digits for " + num + " is : " + addition(num)
            );
            end = repeat();
            break;
          }
        default:
          System.out.println("Please enter a valid number.");
          break;
      } //end of switch case block
    } //end of while loop
  } //end of selection method
} //end of sumNumbers class
