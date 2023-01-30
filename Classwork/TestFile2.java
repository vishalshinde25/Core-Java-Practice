package Classwork;

import java.io.*;
public class TestFile2 {
    public static void main(String args[]) {
        
    try {  
            File file = new File("D:\\java_test_file_3.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }        
        } 
    catch (IOException e) {  
            e.printStackTrace();  
        }  
    // creates a Multiline
    String program = "This is Demo Text.";
    try {
      // Creates a Writer using FileWriter
      FileWriter output = new FileWriter("D:\\java_test_file_3.txt");

      // Writes the program to file
      output.write(program);
      System.out.println("Data is written to the file.");

      // Closes the writer
      output.close();
    }
    catch (Exception e) {
      e.getStackTrace();
    }
 } 
}    