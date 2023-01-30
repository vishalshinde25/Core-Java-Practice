package Classwork;

import java.io.FileInputStream; 

public class FileInput {
	 public static void main(String args[]){    
		 try{    
	            FileInputStream obj=new FileInputStream("D:\\testout.txt");    
	            int i=0;
	     while((i=obj.read())!=-1)
	        {    
	             System.out.println((char)(i));    
	        }    
	            obj.close();    
	        }
		 catch(Exception e)
		 	{
			 	System.out.println(e);}    
	     	}  
}

//Output:
//W
//e
//l
//c
//o
//m
//e
// 
//t
//o
// 
//E
//c
//l
//i
//p
//s
//e
// 
//I
//D
//E
//.
