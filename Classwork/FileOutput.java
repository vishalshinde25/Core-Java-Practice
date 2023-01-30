package Classwork;
import java.io.*; 
public class FileOutput {
	public static void main(String args[]){    
        try
        {    
	          FileOutputStream obj1=new FileOutputStream("D:\\testout2.txt");    
	          String ob="East Aur West CDAC Kolkata is Best";    
	          byte b[]=ob.getBytes();   
	          obj1.write(b);    
	          obj1.close();    
	          System.out.println("Done...");    
         }
        catch(Exception e)
        	{
        		System.out.println(e);
        	}    
   }  
}
