import java.util.Scanner;

public class AllPrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		sc.close();
		for(int i=2; i<=num; i++)
		{
			boolean isPrime= true;
			for(int j=2; i<i;j++)
			{
				if(i%j==0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime=true)
			{
				System.out.print(i+" ");
			}
		}
		
	}
}
