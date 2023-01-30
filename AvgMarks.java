import java.util.*;
public class AvgMarks {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char name;
		int m1, m2, m3;
		name=sc.next().charAt(0);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		sc.close();
		System.out.println("Student's Name(Initial): "+name);
		System.out.println("Avg Marks: "+((m1+m2+m3)/3));		
	}
}

//V
//4 5 6
//Student's Name(Initial): V
//Avg Marks: 5
