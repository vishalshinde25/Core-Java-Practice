package Pattern1;

import java.util.Scanner;

public class CharacterPattern5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.print("Enter number of rows:");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=noOfRows)
		{
			char ch=(char)('A'+noOfRows);
			int j=1;
			while(j<=i)
			{
				System.out.print((char)(ch-1)+" ");
				ch=(char)(ch-1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows:5
//E 
//E D 
//E D C 
//E D C B 
//E D C B A 
