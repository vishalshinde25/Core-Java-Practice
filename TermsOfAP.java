//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N:");
		int n=sc.nextInt(), result;
		sc.close();
		int i=1, current=1;
		while(i<=n)
		{
			result=(3*current+2);
			if(result%4!=0)
			{
				System.out.print(result+" ");
				i++;
			}	
			current++;
		}
	}
}

//Enter N:4
//5 11 14 17

//Enter N:10
//5 11 14 17 23 26 29 35 38 41 
