import java.util.Scanner;

public class CheckPrimeReturnKeyward {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, divisor=2;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		sc.close();
		while(divisor<=num-1)
		{
			if(num%divisor==0)
			{
				System.out.println("Composite Number");
				return;
			}
			divisor=divisor+1;
		}
		System.out.println("Prime Number");
	}
}
