package Pattern1;

import java.util.Scanner;

public class SquarePattern1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int noOfRows;
	int i=1;
	System.out.print("Enter number of rows: ");
	noOfRows=sc.nextInt();
	sc.close();
	while(i<=noOfRows)
	{
		int j=1;
		while(j<=noOfRows)
		{
			System.out.print(i+" ");
			j++;
		}
		System.out.println();
		i++;
	}
	}

}

//Enter number of rows: 4
//1 1 1 1 
//2 2 2 2 
//3 3 3 3 
//4 4 4 4 