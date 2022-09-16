package lockedMe.com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class GetFiles {
	
	static void listFiles () throws IOException {
		
//     Creating a list object based on the file path  
		List<Path> get= Files.list(Paths.get("C:\\Users\\user\\git\\projectphaseonemw\\src\\ExampleFiles"))
		//Filtering for checking whether file exist  
		.filter(Files::exists)
		//Mapping to get file names only 
		.map(Path::getFileName)
		//Sorting Files by default ascending order(Will not work on numbers)
        .sorted()
        //creating the list
        .collect(Collectors.toList());
		
        get.forEach(System.out::println);
}

	public static void main(String[] args) throws IOException {
		
		
		listFiles();
	}
}