package Array;

import java.util.Scanner;

public class ArrayUse {
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

	public static void main(String[] args) 
	{
//		printArray(inputArray()); // short-way
		int arr[]=inputArray();
		printArray(arr);
	}
}
