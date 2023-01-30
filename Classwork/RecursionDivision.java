package Classwork;
import java.util.*;
public class RecursionDivision {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the value to Number 1: ");
		
		int num1=scan.nextInt();

		System.out.print("Enter the value to Number 2: ");

		int num2=scan.nextInt();

		int result=divisionNum(num1,num2);
		System.out.println("Division of "+num1+" and "+num2+": "+result);
		scan.close();
		}
		
	static int divisionNum(int x,int y)
		{
			if (y==0)
			{
			  return 0;
			}
			else if (x-y==0){
			    return 1;
			}
			else if (x<y){
			    return 0;
			}
			else{
			    return (1+divisionNum(x-y,y));
			}
		}

	}

