package Classwork;
import java.io.File;
public class FileInfo {
	public static void main(String[] args) {
		File f0 = new File("D:\\java_test_file_3.txt");  
		if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking wh
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } 
		else 
		{  
            System.out.println("The file does not exist.");
        }  
    }   
}     
            

//Funtions of file class
//We get the name of the file using the getName()
//We get the absolute path of the file using the getAbsolutePath() method of the file.
//We check whether we can write data into a file or not using the canWrite()
//We check whether we can read the data of the file or not using the canRead()
//We get the length of the file by using the length()


            