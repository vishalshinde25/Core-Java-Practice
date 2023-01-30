import java.util.Scanner;

//Write a program that asks the user for a number N and a choice C. 
//And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N 
//(both inclusive).
public class SumOrProductByChoice {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		System.out.print("Enter Choice(1:Sum 2:Product): ");
		int c=sc.nextInt();
		sc.close();
		if(c==1)
		{
			int sum=0, num=1;
			for(;num<=n; num++)
			{
				sum=sum+num;
			}
			System.out.println("Sum= "+sum);
		}
		else if(c==2)
		{
			int product=1, num=1;
			for(; num<=n; num++)
			{
				product=product*num;
			}
			System.out.println("Product= "+product);
		}
		else
			System.out.println("Wrong Choice..");
	}
}
