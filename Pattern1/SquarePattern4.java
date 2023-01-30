package Pattern1;

import java.util.Scanner;

public class SquarePattern4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N:");
		int n;
		n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(n+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}

//Enter N:
//4
//4 4 4 4 
//4 4 4 4 
//4 4 4 4 
//4 4 4 4 

