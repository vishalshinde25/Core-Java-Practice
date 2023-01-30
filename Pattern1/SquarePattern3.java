package Pattern1;

import java.util.Scanner;

public class SquarePattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.print("Enter number of rows: ");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=noOfRows) 
		{
			int j=1;
			while(j<=noOfRows)
			{
				System.out.print((noOfRows-j+1)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows: 4
//4 3 2 1 
//4 3 2 1 
//4 3 2 1 
//4 3 2 1 