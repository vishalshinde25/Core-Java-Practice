import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, div=2;
		System.out.println("Enter Number");
		num=sc.nextInt();
		sc.close();
		boolean isPrime=true;
		while(div < num-1) 
		{
			if (num % div == 0)
			{
				isPrime=false;
			}
			div=div+1;	
		}
		if(isPrime==true)
			{ 
				System.out.println("Prime"); 
			}
		else
			{ 
				System.out.println("Composite"); 
			}
	}
}
