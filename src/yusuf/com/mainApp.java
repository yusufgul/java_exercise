package yusuf.com;

import java.util.Scanner;

 class mainApp {

	 public static void menu() {//prints the main menu to the screen
		System.out.println("...............................................");
		System.out.println("...............................................");
	    System.out.println("Please select a program from below to continue.");
	    System.out.println("...............................................");
	    System.out.println("...............................................\n");
		System.out.println("1- Array operations.");
		System.out.println("2- Number guessing game.");
		System.out.println("3- Find repeating numbers in a array.");
		System.out.println("4- Find the sum of the digits of a number.");
		System.out.println("5- Draw an equilateral triangle from numbers.");
		System.out.println("6- Move symbol inside star array.");
		System.out.println("7- Exit.\n");
	 } //end of menu block
	
	 
	public static void main(String[] args) {
		
		boolean end = false;//for checking if the user wants to end program
		
	while(!end) {	//loop until end command comes from user
		
	try {	
		menu();
		
	        Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); //select which program to run
		System.out.println("You have selected option "+number+":\n\n");
		
		switch(number) {
		case 1:{
		intArrayOp.switchBlock(intArrayOp.getArray()); //allows user to input an array of integer numbers and do various operations on that array
		break;
		}
                case 2:{
        	numberGuessing.numberGuessingGame(); // a basic game where user tries to guess a randomly generated number by computer
		break;
		}
                case 3:{
        	repeatingNumbers.selection(); // this program detects repeating numbers in a integer array and prints them ons screen
		break;
                }
                case 4:{
        	sumNumbers.selection(); //this number allows user to input a integer number, then calculates the sum of digits of that number
		break;
                }
                case 5:{
        	drawEquilateralTriangle.drawTriangle(); //this program makes user enter a number and draws equilateral triangle according to that number
		break;
                }
                case 6:{
        	moveSymbol.moveCursor(); // this program allows user to control the position of symbol in the middle of star matrix
	        break;
                }
                case 7:{
        	System.out.println("Goodbye."); //program ends
        	end = true;
	        break;
                }
		default:{
		System.out.println("Please enter a valid number."); break;
		}
                }//end of switch case block
		
	} catch(Exception e) {
	        System.out.println("An error has been encountered. Please try again."); //if user enters wrong type of data, start program again.
	}//end of catch block
		
   }//end of while loop
		
 }//end of main method

}//end of mainApp class
