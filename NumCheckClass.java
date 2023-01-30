import java.util.Scanner;
import numcheck.*;
public class NumCheckClass {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num=sc.nextInt();
        sc.close();
        Prime ob1 = new Prime();
        Perfect ob2 = new Perfect();
        Palindrome ob3 = new Palindrome(); 
        if(ob1.isPrime(num)==true)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");

        if(ob2.isPerfect(num)==true)
        System.out.println("Perfect");
        else
        System.out.println("Not Perfect");

        if(ob3.isPalindrome(num)==true)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
    }
}
