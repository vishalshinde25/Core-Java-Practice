package Pattern2;

import java.util.Scanner;

public class IsoscelesTrianglePattern {

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
			int p=1;
			while(j<=i)
			{
				System.out.print(p);
				p++;
				j++;
			}
			
			p=i-1;
			j=1;
			while(j<=i-1)
			{
				System.out.print(p);
				p--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows: 4
//   1
//  121
// 12321
//1234321

