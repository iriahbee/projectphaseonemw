package lockedMe.com;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortFiles {
	
	 
	static List<String> fileList = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\user\\git\\projectphaseonemw\\src\\ExampleFiles");
        listDirectory(file);
        Collections.sort(fileList);
        System.out.println(fileList);
        
	}
        
        public static void listDirectory(File file) {
            if(file.isDirectory()) {
                File[] files = file.listFiles();
                for(File currFile : files) {
                    listDirectory(currFile);
                    
                }
            }
            else {
                fileList.add(file.getName());
              
            }
       
          
	}
}