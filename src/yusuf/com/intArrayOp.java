package yusuf.com;

import java.util.Scanner;

import java.util.Arrays;

public class intArrayOp {
	
	 static int[] getArray() {
		 
		 int number;
			
		    System.out.print("How many number would you like to enter? : \n");
		  
			Scanner sc = new Scanner(System.in);
			 
			number = sc.nextInt();
			
			int[] myIntArray = new int[number];
			
			for (int i=0; i<number; i++) {
				System.out.print("Please enter "+(i+1)+". number: ");
				myIntArray[i] = sc.nextInt();
			}
			
			System.out.println("\nTHE NUMBERS YOU HAVE ENTERED ARE: "+Arrays.toString(myIntArray));
			
			return myIntArray;
		  }//end of getArray method

	 static void findBiggest(int[] myIntArray) {
		 
		 int theBiggest = myIntArray[0];
		 
		 for(int i=0; i<myIntArray.length; i++) 
		       if(myIntArray[i] >= theBiggest) theBiggest = myIntArray[i];
			 
		 System.out.println("THE BIGGEST NUMBER AMONG THE NUMBERS YOU HAVE ENTERED IS: "+theBiggest);
		 	 
	 }//end of findBiggest method

	 static void findSmallest(int[] myIntArray) {
		 
		 int theSmallest = myIntArray[0];
		 
		 for(int i=0; i<myIntArray.length; i++) 
		       if(myIntArray[i] <= theSmallest) theSmallest = myIntArray[i];
			 
		 System.out.println("THE SMALLEST NUMBER AMONG THE NUMBERS YOU HAVE ENTERED IS: "+theSmallest);
		 	 
	 }//end of findSmallest method
	 
	 static void averageNumber(int[] myIntArray) {
		 
		 int sum=0;
		 
		 for(int i=0; i<myIntArray.length; i++) sum += myIntArray[i];
		 
		 System.out.println("THE AVERAGE NUMBER OF GIVEN NUMBERS IS: "+(sum/myIntArray.length));
	 }//end of averageNumber method
	 
	 static void SmallToBig(int[] myIntArray) {
		 	 
		 int temp = 0;
		 
		 for (int i = 0; i < myIntArray.length; i++) {     
	            for (int j = i+1; j < myIntArray.length; j++) {     
	               if(myIntArray[i] > myIntArray[j]) {    
	                   temp = myIntArray[i];    
	                   myIntArray[i] = myIntArray[j];    
	                   myIntArray[j] = temp;    
	               }     
	            }     
	        } 
		 System.out.println("SORTED NUMBERS ARE: "+Arrays.toString(myIntArray)); 
	 }//end of SmallToBig method
	 
	 static int menu() {
		    System.out.println("\n******************************************************");
		    System.out.println("What would you like to do? : ");
			System.out.println("  1-Find the biggest one among the numbers entered.");
			System.out.println("  2-Find the smallest one among the numbers entered.");
			System.out.println("  3-Find the average of the numbers entered.");
			System.out.println("  4-Print the entered numbers in ascending order.");
			System.out.println("  5-Re-enter the numbers.");
			System.out.println("  6-Return to the main menu.");
			System.out.println("******************************************************\n");
			Scanner sc = new Scanner(System.in);	 
			int selection = sc.nextInt();
			return selection;
	 }//end of menu method
	 
	 static void switchBlock(int[] myIntArray) {
		 
	     boolean end = false;
		 while(!end) {
			switch(menu()) {
			case 1: findBiggest(myIntArray); break;
			case 2: findSmallest(myIntArray); break;
			case 3: averageNumber(myIntArray); break;
			case 4: SmallToBig(myIntArray); break;
			case 5: myIntArray = getArray(); break;
			case 6: System.out.println("THE PROGRAM HAS BEEN TERMINATED SUCCESSFULLY."); end=true; break;
			default: System.out.println("Please enter a valid number."); break;	
			}//end of switch case block
		}//end of while loop
	 }//end of switch method
	 
}//end of intArrayOp class
