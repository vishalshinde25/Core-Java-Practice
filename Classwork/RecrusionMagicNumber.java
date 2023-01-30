package Classwork;

public class RecrusionMagicNumber {

	public static void main(String[] args) {
		checkMagic(7777);
	}
	static boolean checkMagic(int num)
	{
		if(num==1)
			return true;
		else if(num>9)
			return checkMagic(sumofDigits(num));
		else 
			return false;
	}
	
	static int sumofDigits(int num)
	{
		int sum;
		for(sum=0; num!=0; num=num/10)  
		{       
			sum = sum + num % 10;  
		}   
		System.out.println("Sum of digits: "+sum);
		return sum;
	}
}
