package lockedMe.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {

	public static void searchFile() {
	
		String filePath = "C:\\Users\\user\\git\\projectphaseonemw\\src\\ExampleFiles\\";
		String fileName = "";
		
		 //   try block
		  try {
			// Creating BufferedReadered object
			  BufferedReader fn = new BufferedReader(
		                new InputStreamReader(System.in));
		            System.out.println("\nEnter the file name you would like find:");
		                
		          // Reading File name + reading file path
		            fileName = fn.readLine();
		            
		          // Create an object of the File class
		          // Replace the file path with path of the directory  
		            File directory = new File(filePath);
		            
		         // store all names with same name
		         // with/without extension
		            String[] flist = directory.list();
		            int flag = 0;
		            if (flist == null) {
		                System.out.println("\nEmpty directory.");
		            }
		            else {
		      
		                // Linear search in the array
		                for (int i = 0; i < flist.length; i++) {
		                    String filename = flist[i];
		                    if (filename.equalsIgnoreCase(fileName)) {
		                        System.out.println(filename + " found");
		                        flag = 1;
		                    }
		                }
		            }
		      
		            if (flag == 0) {
		                System.out.println("\nFile Not Found");
		            }
		        }
		   
		      catch(IOException e) {
		      System.out.println("\nException Occurred:");
		      e.printStackTrace();
		    }    
		 } 

		
		public static void main(String[] args) {
		
			searchFile();
	}

}
