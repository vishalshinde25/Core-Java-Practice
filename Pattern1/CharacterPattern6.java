package Pattern1;

import java.util.Scanner;

public class CharacterPattern6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.print("Enter number of rows:");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=noOfRows)
		{
			char ch=(char)('A'+noOfRows-i);
			int j=1;
			while(j<=i)
			{
				System.out.print(ch+" ");
				ch=(char)(ch+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

//Enter number of rows:5
//E 
//D E 
//C D E 
//B C D E 
//A B C D E 