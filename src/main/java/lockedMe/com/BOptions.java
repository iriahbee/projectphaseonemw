package lockedMe.com;

import java.io.IOException;
import java.util.Scanner;

public class BOptions {
	
	
	public static void newOpts() throws IOException {
	try (// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in)) {
		        System.out.println("Select 'AF' to Add File");
		        System.out.println("Select 'S' to Search for File");
		        System.out.println("Select 'D' to Delete");
		        System.out.println("Select 'E' to Exit to Main Menu");
		        System.out.println("What would you like to do? ");
				
		        String b_opts = input.next();
			
				
				   if("AF".equals(b_opts)) {
					System.out.println("Choice Add");	
					}
					
					else if ("S".equals(b_opts)) {
						System.out.println("Choice Search");	
						
					}
					
					else if ("D".equals(b_opts)) {
						System.out.println("Choice Delete");	
					}
					
					else {
						System.out.println("Invalid Input Choice");
					}
				}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		newOpts();
	}
}