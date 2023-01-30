import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num=sc.nextInt();
		sc.close();
		if(num%2==0)
			System.out.println(num+" is Even.");
		else
			System.out.println(num+" is Odd.");
	}

}

//5
//5 is Odd.
//10
//10 is Even.
