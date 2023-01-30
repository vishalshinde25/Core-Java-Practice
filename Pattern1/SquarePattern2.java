package Pattern1;

import java.util.Scanner;

public class SquarePattern2 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.println("Enter number of rows: ");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=noOfRows) 
		{
			int j=1;
			while(j<=noOfRows)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}

//Enter number of rows: 
//4
//1 2 3 4 
//1 2 3 4 
//1 2 3 4 
//1 2 3 4 
