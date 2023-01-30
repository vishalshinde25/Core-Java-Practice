package Classwork;
import java.io.*;
public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		 	int i = 0;  
	        FileReader fr = new FileReader("D:\\FileReader.txt");  
	        while ((i = fr.read()) != -1)  
	            System.out.print((char) i);  
	        fr.close();  
	}
}

//Output:
//	This program read text file located at D drive.
//	File Path: D:\\FileReader.txt
//	File text:
//	Remember Why You Started!