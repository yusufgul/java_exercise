package yusuf.com;

import java.util.Scanner;

public class moveSymbol {
	
	public static void print(String matrix[][]) {
		
		for(int i=0; i<matrix.length; i++) {
			
		      for(int j=0; j<matrix[0].length; j++) {
		    	  
		        System.out.print(matrix[i][j] + " ");
		        
		      }//end of interior for loop
		      System.out.println();
		    }//end of outer for loop
	}//end of print method

	public static void clear() {  //this method prints empty lines, so screen seems clean
	    for (int i = 0; i<50; i++){
	       System.out.print('\n');
	    }
	}//end of clear method
	
	public static void moveCursor() {
		
		int x=2, y=2; //coordinates of middle of the star map
		boolean end = false;
		String cover[][] =
		      { { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", "< >", " * ", " * " }
		      , { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", " * ", " * ", " * " }};
		System.out.println("In order to move symbol, use numbers 2, 4, 6 or 8. To end the program, press 5.");
		print(cover);
		
	while(!end) {	
		
		String matrix[][] = //prints stars all over matrix, then symbol is printed to its new coordinates
		      { { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", " * ", " * ", " * " }
		      , { " * ", " * ", " * ", " * ", " * " }, { " * ", " * ", " * ", " * ", " * " }};
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		clear(); //creates a false impression of terminal being cleaned from texts because i couldn't find a way to actually clear it
		
		switch(number) {
		case 2:{
			x++;
			if(x==5) x=0;
			break;
		}//case of moving down
		case 4:{
			y--;
			if(y==-1) y=4;
			break;
		}//case of moving to the left
		case 8:{
			x--;
			if(x==-1) x=4;
			break;
		}//case of moving up
		case 6:{
			y++;
			if(y==5) y=0;
			break;
		}//case of moving to the right
		case 5:{
			end = true;
			System.out.println("Program has ended.");
			System.out.println("\nNow returning to the main menu...");
			break;
		}//case of exit from loop
		default:{
			System.out.println("You must enter a valid number!");
		}
		}//end of switch case block
	
		matrix[x][y] = "< >"; //places symbol to its coordinates
		print(matrix); //prints matrix after every movement

	}//end of while loop
	}//end of moveCursor method
	

}//end of moveSymbol class
	