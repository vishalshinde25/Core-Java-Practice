package Pattern1;

import java.util.Scanner;

public class CharacterPattern2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int noOfRows;
		System.out.print("Enter number of rows:");
		noOfRows=sc.nextInt();
		sc.close();
		int i=1;
		
		while(i<=noOfRows)
		{
			char StartingChar=(char)('A'+i-1);
			int j=1;
			while(j<=noOfRows)
			{
				System.out.print((char)(StartingChar)+" ");
				StartingChar=(char)(StartingChar+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}

//Enter number of rows:4
//A B C D 
//B C D E 
//C D E F 
//D E F G 
