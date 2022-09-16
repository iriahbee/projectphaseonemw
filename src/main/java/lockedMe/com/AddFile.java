package lockedMe.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class AddFile {
	
	 public static void newFile(){
	  String filePath = "C:\\Users\\user\\git\\projectphaseonemw\\src\\ExampleFiles\\";
	  String fileName = "";
	  String fileExtension = "";
	  String fileContent= "";
	  
	  //   try block
	  try {
		// Creating BufferedReadered object
		  BufferedReader fn = new BufferedReader(
	                new InputStreamReader(System.in));
	            System.out.println("Enter the file name:");
	                
	          // Reading File name + reading file path
	            fileName = fn.readLine();
	            
	            System.out.println("Enter the extention name (eg. py, txt, word, docx):");
	            
	            fileExtension = fn.readLine();
	            
	            System.out.println("Enter the file content:");
	            fileContent = fn.readLine();
	            
	            File nfile
                = new File(filePath +""+ fileName +"."+ fileExtension);
	            
	          // Method createNewFile() method creates blank file.
	            boolean isFileCreated = nfile.createNewFile();
	                    if (isFileCreated)
	                       System.out.print("The file has been added successfully!!");
	            	   else
	                       System.out.println("File already present!!");
	              
	         // creating new buffered object
	            BufferedWriter writer = new BufferedWriter(new FileWriter(nfile));
	         // adding the data to the file
	            writer.write(fileContent);
	         // closing the file after editing
	            writer.close();
	                    
	  }   catch(IOException e) {
	      System.out.println("Exception Occurred:");
	      e.printStackTrace();
	    }        
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		newFile();
	}

}
