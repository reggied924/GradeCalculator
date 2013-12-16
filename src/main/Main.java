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
				+ "2) Percentage ";
		
		System.out.println(menu); 
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt(); 
			
			switch(input){
			
			case 1: 
				System.out.print("You chose option 1");
				break;
				
			case 2:
				System.out.print("You chose option 2");
				break;
				
			default:
				System.out.print("invalid selection"); 
			
			}
			
		
		
	}//end of printMenu

}
