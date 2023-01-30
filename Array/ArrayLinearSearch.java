package Array;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int []arr= {2, 13, 4, 1, 3, 6, 28};
		System.out.print("Enter Element to search: ");
		int search=sc.nextInt();
		sc.close();
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Position of "+search+" is at index arr["+i+"].");
				return;
			}	
		}
		System.out.println(-1);
	}
}
