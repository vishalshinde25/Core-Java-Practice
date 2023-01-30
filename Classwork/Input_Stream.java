//WAP to read the data from a text file "test.txt" and print the value of each character.

package Classwork;
import java.io.*;
public class Input_Stream {

	public static void main(String[] args) {
		 	byte[] array = new byte[100];
		    try
		    {
			      InputStream is = new FileInputStream("D:\\input.txt");
			      System.out.println("Available bytes(input.txt file): " + is.available());
			      is.read(array);
			      System.out.print("Data read from the input.txt file: ");
			      String data = new String(array);
			      System.out.println(data);
			      System.out.println((data));
			      is.close();
		    } 
		    catch (Exception e) 
		    {
		    	e.getStackTrace();
		    }
	}
}
