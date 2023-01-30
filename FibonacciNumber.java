import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		sc.close();
		int a=1, b=1, c;
		for(int i=1; i<=num; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}
}

//Enter Number: 10
//1 2 3 5 8 13 21 34 55 89