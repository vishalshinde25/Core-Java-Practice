package Pattern1;

import java.util.Scanner;

public class TriangularPattern6 {
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N: ");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n)
		{
			int j=i;
			while(j>=1)
			{
				System.out.print(j);
				j-=1;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter N: 4
//1
//21
//321
//4321
