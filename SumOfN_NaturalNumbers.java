import java.util.Scanner;

public class SumOfN_NaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n: ");
		int n,sum=0, i=1;
		n=sc.nextInt();
		sc.close();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
