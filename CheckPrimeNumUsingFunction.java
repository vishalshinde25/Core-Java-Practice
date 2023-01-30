import java.util.Scanner;

public class CheckPrimeNumUsingFunction {

	public static boolean checkPrime(int num) {
		int div=2;
		while(div<=num/2)
		{
			if(num%div==0)
			{
				return false;
			}
			div=div+1;	
		}
		return true;
	}
	public static void main(String[] args) {
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number: ");
			num=sc.nextInt();
			sc.close();
			boolean a=checkPrime(num);
			System.out.println(a);
	}

}
