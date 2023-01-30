//
//public class SimpleInterest {
//
//	public static void main(String[] args) {
//			double principal = 2500.0, rate = 6.0, time = 5.0;
//			double si = (principal * rate * time) / 100;
//			System.out.println("Simple Interest = " + si);
//				}
//}
//Simple Interest = 750.0

import java.util.*;
public class SimpleInterest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double si, principal, rate, time;
principal = input.nextDouble();
rate = input.nextDouble();
time = input.nextDouble();
input.close();
si = (principal * rate * time) / 100;
System.out.println("Simple Interest= " + si);
}
}

//5000
//6
//4
//Simple Interest= 1200.0
