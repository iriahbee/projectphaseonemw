package lockedMe.com;

import java.util.Scanner;

public class BOptions {
	
	
	public static void newOpts() {
	try (// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in)) {
		        System.out.println("Select 'AF' to Add File");
		        System.out.println("Select 'S' to Search for File");
		        System.out.println("Select 'D' to Delete");
		        System.out.println("Select 'E' to Exit to Main Menu");
		        System.out.println("What would you like to do? ");
				
		        String b_opts = input.next();
			
				
				   if("AF".equals(b_opts)) {
					   AddFile.newFile();
					}
					
					else if ("S".equals(b_opts)) {
						System.out.println("Choice Search");	
						
					}
					
					else if ("D".equals(b_opts)) {
						DeleteFile.removeFile();
					}
				   
					else if ("E".equals(b_opts)) {
						
					}
					
					else {
						System.out.println("Invalid Input Choice");
					}
				}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		newOpts();
	}
}