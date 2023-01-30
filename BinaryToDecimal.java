import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		sc.close();
		int decimal=0, pow=1, last;
		while(num>0)
		{
			last = num % 10;
			decimal += last * pow;
			pow *= 2;
			num = num / 10;
		}
		System.out.println(decimal);
	}
}
