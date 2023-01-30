package Classwork;

import java.util.Scanner;

public class RecrusionPower {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the value of X: ");
		int a=scan.nextInt();
		System.out.print("Enter the value of N: ");
		int b=scan.nextInt();
		double result=power(a,b);
		System.out.println(result);
		scan.close();
	}
	
	static double power(int x, int n)
	{
		if(n==0)
			return 1;
		else if(n>0)
			return x*power(x,n-1);
		else
			return 1.0/x*(power(x,n+1));
	}

}
