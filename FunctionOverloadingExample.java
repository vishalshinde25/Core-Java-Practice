
public class FunctionOverloadingExample {
	public static int sum(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
		return a+b;
	}
	public static double sum(double a, double b)
	{
		double result=a+b;
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		int a=12,b=15;
		sum(a,b);
		sum(12.0,15.0);	
	}
}
