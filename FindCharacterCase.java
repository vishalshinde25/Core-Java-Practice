//4.19
import java.util.*;
public class FindCharacterCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.print("Enter Character: ");
		ch=sc.next().charAt(0);
		sc.close();
		if(ch>='A' && ch<='Z' )
		{
			System.out.println(1);
		}
		else if(ch>='a' && ch<='z' )
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(-1);
		}
	}
}
