package Pattern1;

import java.util.Scanner;

public class CharacterPattern4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.print("Enter number of rows:");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=noOfRows)
		{
			char ch='A';
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(ch+i-1)+" ");
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows:4
//A 
//B C 
//C D E 
//D E F G 
