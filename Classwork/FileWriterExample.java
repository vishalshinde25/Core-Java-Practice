package Classwork;
import java.io.*;
public class FileWriterExample {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\FileWriter.txt");
        String s = "This is an example of File Writter Class.";  
        char ch[] = s.toCharArray();  
        for (int i = 0; i < ch.length; i++)  
            fw.write(ch[i]);  
        fw.close();
	}
}

//Output:
//	This program generate text file located at D drive.
//	File Path: D:\\FileWriter.txt
//	File Text:
//	This is an example of File Writter Class.