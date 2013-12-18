package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		printMenu();

	}
	
	public static void printMenu(){
		
		System.out.println("Welcome!");
		
		String menu = "What type of grading scheme?\n"
				+ "1) Point\n"
				+ "2) Percentage\n"
				+ "3) Exit\n";
		
		while(true){
			
			System.out.println(menu); 
			
			Scanner scan = new Scanner(System.in);
			
			int input = scan.nextInt(); 
				
				switch(input){
				
				case 1: 
					System.out.println("You chose option 1"); 
					break;
					
				case 2:
					System.out.println("You chose option 2");
					break;
					
				case 3:
					System.exit(0);
					
				default:
					System.out.println("invalid selection"); 
				
				}
			
		}//end of while
		
	}//end of printMenu

}//end of class
