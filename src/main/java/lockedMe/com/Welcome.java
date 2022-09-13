package lockedMe.com;



public class Welcome {
	
	//Method to display a welcome message
	
	public void displayWelcome () {
		 System.out.println("*******Welcome to LockedMe.com!!*******");
		 System.out.println("My name is Solagne Lake and I am this applications programmer.");
		 System.out.println("I work with Java, Javascript and Python.");
		 System.out.println("----------------------------------------");
		 System.out.println("");
		 
	}
	
	public void displayAppInfo () {
		 System.out.println("This application is a file management system.");
		 System.out.println("See your options below to get started:");
		 System.out.println("----------------------------------------");
		 System.out.println("");
	}
	
	
	public void displayOptions() {
		
        MainOptions Opt = new MainOptions();
		
		System.out.println("1. "+ Opt.optionA);
		System.out.println("2. "+ Opt.optionB);
		System.out.println("3. "+ Opt.optionC);	
		System.out.println("----------------------------------------");
		System.out.println("");
	}
	
	public void displayInput() {
		InputOptions In = new InputOptions();
		
		In.newIn();
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object of the Welcome
		Welcome intro = new Welcome();
		
		// calling the display Welcome Method
		intro.displayWelcome();
		
		// calling the displayAppInfo Method
		intro.displayAppInfo();
		
		// calling the displayOptions Method
		intro.displayOptions();
        
		// calling the displayInput Method
		intro.displayInput();
	}

}
