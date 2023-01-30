import java.util.Scanner;

public class FahrenheitToCelsiusTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int StartF, EndF, W, Cel;
		Scanner sc= new Scanner(System.in);
		StartF=sc.nextInt();
		EndF=sc.nextInt();
		W=sc.nextInt();
		sc.close();
		while(StartF<=EndF)
		{
			Cel=5*(StartF-32)/9;
			System.out.println(StartF+"\t"+Cel);
			StartF=StartF+W;
		}
	}
}

//0
//100
//20
//0	-17
//20	-6
//40	4
//60	15
//80	26
//100	37
