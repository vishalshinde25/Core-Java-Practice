package Array;

import java.util.Scanner;

public class SumOfArrayElemets {
	public static int[] inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of arry: ");
		int size=sc.nextInt();
		System.out.print("Enter "+size+" Inputs:");
		int input[]=new int[size];
		for(int i=0;i<size; i++)
		{
			input[i]=sc.nextInt();
		}
		sc.close();
		return input;
	}
	
	public static void printArray(int input[])
	{
		int size=input.length;
		System.out.print("Elements are: ");
		for(int i=0;i<size; i++)
		{
			System.out.print(input[i]+" ");
		}
		return;
	}
	
	public static void sumOfArray(int input[])
	{
		int size=input.length;
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum=sum+input[i];
		}
		System.out.println("Sum of Array Element: "+sum);
	}
	public static void main(String[] args) {
		int arr[]=inputArray();
		printArray(arr);
		System.out.println();
		sumOfArray(arr);
	}

}
