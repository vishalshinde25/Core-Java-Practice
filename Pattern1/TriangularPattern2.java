package Pattern1;
import java.util.Scanner;
public class TriangularPattern2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N:");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n)
		{
			int j=1;
			int startingNo=i;
			while(j<=i)
			{
				System.out.print(startingNo+" ");
				startingNo++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter N:
//4
//1 
//2 3 
//3 4 5 
//4 5 6 7 