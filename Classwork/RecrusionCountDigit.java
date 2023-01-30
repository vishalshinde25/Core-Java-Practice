package Classwork;

public class RecrusionCountDigit {

	public static void main(String[] args) {
		 countD(123);
	}
	static void countD(int num)
	{
		int count=0;
		while (num != 0) 
		{
		      num /= 10;
		      ++count;
		}
		System.out.println("Number of digits: " + count);

	}
}
