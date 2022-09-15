package lockedMe.com;

import java.io.IOException;
import java.util.Scanner;

public class InputOptions {
  
	public void newIn() {

		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("What would you like to do? ");
			String main_opt = input.next();
			
			if("A".equals(main_opt)) {
			System.out.println("These files are currently in the folder:");
			try {
				GetFiles.listFiles();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
			
			else if ("B".equals(main_opt)) {
				try {
					BOptions.newOpts();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
			}
			
			else if ("C".equals(main_opt)) {
				System.out.println("Choice C");	
			}
			
			else {
				System.out.println("Invalid Input Choice");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	

}
