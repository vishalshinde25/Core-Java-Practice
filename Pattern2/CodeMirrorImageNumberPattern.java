package Pattern2;

import java.util.Scanner;

public class CodeMirrorImageNumberPattern {

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
			while(j<=noOfRows-i)
			{
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows: 4
//   1
//  12
// 123
//1234
