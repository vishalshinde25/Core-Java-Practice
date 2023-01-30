import java.util.Scanner;

public class checkMemberOfFibonacciSeries {
	public static boolean fibonacci(int num)
	{
		int a=1, b=1, c;
		while(a<num)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a+" ");
		}
		if(a==num)
		{
			System.out.println(true);
			return true;
		}
		else
		{
			System.out.println(false);
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.print("Enter Number: ");
		num=sc.nextInt();
		sc.close();
		fibonacci(num);
	}
}
