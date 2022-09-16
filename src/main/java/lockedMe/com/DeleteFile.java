package lockedMe.com;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Paths;

public class DeleteFile {
	
	public static void removeFile() {
		
		 String filePath = "C:\\Users\\user\\git\\projectphaseonemw\\src\\ExampleFiles\\";
		  String fileName = "";
		
		  //   try block
		  try {
			// Creating BufferedReadered object
			  BufferedReader fn = new BufferedReader(
		                new InputStreamReader(System.in));
		            System.out.println("Enter the file name including extension:");
		                
		          // Reading File name + reading file path
		            fileName = fn.readLine();
		            
		            boolean isDeleted = Files.deleteIfExists(
		                    Paths.get(filePath+fileName));
		            
		            if (isDeleted) {
		                System.out.println("File is successfully deleted!");
		              } 
		              else {
		                System.out.println("Sorry, the file was not found.");
		              }
		            }
		                   
		  // If the input directory is not empty
		   catch (DirectoryNotEmptyException e) {
		              System.out.println("Directory is not empty!");
		            }
		  // If some I/O error occurred
		    catch (IOException e) {
			  System.out.println("Exception Occurred:");
		      e.printStackTrace();
		}    
		  // Delete access denied issue
		    catch (SecurityException e) {
		      System.out.println("Delete access denied!");
		    }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        removeFile();
	}

}
