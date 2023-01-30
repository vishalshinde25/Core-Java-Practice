package Pattern1;

import java.util.Scanner;

public class TriangularPattern5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N:");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter N:
//4
//1
//22
//333
//4444
