package Pattern2;

import java.util.Scanner;

public class InvertedTriangle {

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
			while(j<=noOfRows-i+1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows: 4
//****
//***
//**
//*
