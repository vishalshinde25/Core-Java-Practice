package Classwork;

public class RecrusionDecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary(100);
	}
	
	static void DecimalToBinary(int num)
	{
		if(num==0)
			System.out.print(num);
		else
		{
			DecimalToBinary(num/2);
			System.out.print(num%2);		
		}
	}
}
