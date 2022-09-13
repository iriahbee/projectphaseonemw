package lockedMe.com;

import java.util.Scanner;

public class InputOptions {
  
	public void newIn() {

		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("What would you like to do? ");
			String main_opt = input.next();
			
			if("A".equals(main_opt)) {
				System.out.println("Choice A");	
			}
			
			else if ("B".equals(main_opt)) {
				System.out.println("Choice B");	
			}
			
			else if ("C".equals(main_opt)) {
				System.out.println("Choice C");	
			}
			
			else {
				System.out.println("Invalid Input Choice");
			}
			
			
		}
	}

}
