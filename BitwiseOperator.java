
public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println("a=10 b=2 c=10 d=-20");
		int a=10, b=2;
		int and=a&b;
		int or=a|b;
		int xor=a^b;
		System.out.println("a&b= "+and);
		System.out.println("a|b= "+or);
		System.out.println("a^b= "+xor);
		System.out.println("~a= "+~a);
		
		int c=10, d=-20;
		System.out.println(c^d); //-26
		
		int leftshift=a<<1;
		System.out.println("Left shift= "+leftshift); //20
		
		int rigtshift=a>>1;
		System.out.println("Right Shift= "+rigtshift); //5
	}
}
 