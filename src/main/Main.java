package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		printMenu();

	}
	
	public static void printMenu(){
		
		System.out.println("Welcome to Grade Calculator!");
		
		String menu =
				  "1) Enter in Name\n"
				+ "2) Enter in Classes\n"
				+ "3) Enter in Assignments\n"
				+ "4) Print Info\n"
				+ "5) Exit\n";
		
		
		while(true){
			
			System.out.println(menu); 
			
			Scanner scan = new Scanner(System.in);
			
			int input = scan.nextInt(); 
				
				switch(input){
				
				case 1: 
					System.out.println("Enter name: ");
					Scanner userInput = new Scanner(System.in);
					String name = userInput.nextLine(); 
					Student student = new Student(name); 
					student.printInfo();
					break;
					
				case 2:
					System.out.println("How many classes");
					break;
					
				case 3:
					break; 
					
				case 4:
					//student.printInfo(); 
					break;
					
				case 5:
					System.exit(0);
					break; 
					
				default:
					System.out.println("invalid selection"); 
				
				}
			
		}//end of while
		
	}//end of printMenu

}//end of class
