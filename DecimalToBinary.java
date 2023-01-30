import java.util.Scanner;
public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		sc.close();
		int binary=0, pv=1, rem;
		for(int i=1;i<=8;i++)
		{
			rem=num%2;
			binary+=rem*pv;
			pv*=10;
			num=num/2;
		}
		System.out.print(binary);
	}
}
