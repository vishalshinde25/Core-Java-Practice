import java.util.Scanner;

public class Calculating_nCr {
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1; i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int fact_r=factorial(r);
		int fact_n=factorial(n);
		int fact_nMinusr=factorial(n-r);
//		int fact_r=1;
//		int fact_n=1;
//		int fact_nMinusr=1;
		sc.close();
//		for(int i=1; i<=n; i++)
//		{
//			fact_n=fact_n*i;	
//		}
//		System.out.println(fact_n);
//		for(int i=1; i<=r; i++)
//		{
//			fact_r=fact_r*i;	
//		}
//		System.out.println(fact_r);
//		for(int i=1; i<=n-r;i++)
//		{
//			fact_nMinusr=fact_nMinusr*i;
//		}
//		System.out.println(fact_nMinusr);
		int nCr=(fact_n)/(fact_r * fact_nMinusr);
		System.out.println(nCr);
	}
}
