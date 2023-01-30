package Classwork;

//import java.util.Scanner;

public class RecrusionPrimeFactor {

	public static void main(String[] args) {
		primefactors(15,3);	
	}
	
	static void primefactors(int num, int f)
	{
		if(f>num)
			return;
		else if(num%f==0)
		{
			System.out.print(f+"\t");
			num/=f;
			primefactors(num,f);
		}
		else
			primefactors(num,f+1);
	}

}
