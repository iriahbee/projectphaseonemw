package lockedMe.com;

import java.util.Scanner;

public class BOptions {
	  
	   //create method for sub menu 
		public static void subMenu() {
            //try block
			try (
					
		   //Scanner to create input object
			Scanner input = new Scanner(System.in)) {
				
				int choice;
				
				//while loop to iterate through options
				while(true){
				
				System.out.print("");
				System.out.println("\nWhat would you like to do? ");
				System.out.print("1.) Add New File.\n");
				System.out.print("2.) Delete File. \n");
				System.out.print("3.) Search for File.\n");
				System.out.print("4.) Back to Main Menu\n");
				System.out.println("----------------------------------------\n");
				System.out.print("\nEnter Your Choice: \n");
				
				
				//variable to hold input option
				choice= input.nextInt();
				
				//switch case of methods 
				switch(choice){
				
				case 1: 
					 AddFile.newFile();
				break;
				
				
				case 2: 
					DeleteFile.removeFile();
			    break;	
				
				case 3: 
				   Search.searchFile();
				break;
				
				case 4: 
					WelcomeScreen.mainMenu();
			    break;	
				
				
				default :
					System.out.println("This is not a valid Menu Option! Please Select Another");
					break;
				}
				
				}	
				}
			    catch (Exception e) {
				e.printStackTrace();
			}
		
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subMenu();
		
	}
}