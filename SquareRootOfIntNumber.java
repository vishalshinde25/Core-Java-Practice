import java.util.Scanner;

public class SquareRootOfIntNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		sc.close();
		int result=0;
		while(result*result<=num)
		{
			result=result+1;
		}
		System.out.println(result-1);
	}
}
