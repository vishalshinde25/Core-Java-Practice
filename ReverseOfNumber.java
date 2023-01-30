import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		sc.close();
		int temp=num, reverse=0, lastDigit;
		while(temp>0)
		{
			lastDigit=temp%10;
			temp=temp/10;
			reverse=reverse*10+lastDigit;
		}
		System.out.println(reverse);
	}

}

//Enter Number: 1200
//21

//Enter Number: 54126
//62145