package Classwork;
import java.io.*;  
public class FileDemo {  
    public static void main(String[] args) {  
  
        try {  
            File file = new File("D:\\filedemo_1.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        }catch (IOException e) {  
            e.printStackTrace();  
        }   
    }   
}
