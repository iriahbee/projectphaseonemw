package lockedMe.com;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeScreen {
	
	//creating method to display welcome greetings
	public static void nWelcome() {
	
	System.out.println("*******Welcome to LockedMe.com!!*******\n");
	System.out.println("My name is Solagne Lake and I am this applications programmer.\n");
	System.out.println("I work with Java, Javascript and Python.\n");
	System.out.println("----------------------------------------\n");
	System.out.println("");
	
	 System.out.println("This application is a file management system.");
	 System.out.println("See your options below to get started:");
	 System.out.println("----------------------------------------");
	 System.out.println("");
	}
	
	// creating main menu method
	public static void mainMenu(){
	
		
		//Scanner to create input object
		try (Scanner input = new Scanner(System.in)) {
			
			
			int choice;
			//while loop to iterate through options
			while(true){
				
			    System.out.println("Main Menu\n");
			    System.out.print("1.) See Current Files in Directory.\n");
			    System.out.print("2.) Perform Actions- Add File, Delete File, Search for File.\n");
			    System.out.print("3.) Exit\n");
			    System.out.println("----------------------------------------\n");
			    System.out.print("\nEnter Your Menu Choice: ");
			 
			 //variable to hold input option
			    choice = input.nextInt();
			
			    //switch case of methods 
			    switch(choice){

			    case 1:
			    System.out.println("\nThese files are currently in the folder:");	
					try {
						GetFiles.listFiles();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					break;
			    case 2: 
			    	BOptions.subMenu();	
			    	break;
			    case 3:        	
			    	 System.out.println("\nExiting Program...");
			         System.exit(0);
			          break;
			     default :
			              System.out.println("\nThis is not a valid Menu Option! Please Select Another");
			              break;
					
	}
	}
		} catch (Exception e) {
			e.printStackTrace();
	}
	}
		

	
public static void main(String[] args) {
	nWelcome();
	mainMenu();
	
}
}