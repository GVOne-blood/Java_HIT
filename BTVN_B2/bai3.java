import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
	Scanner nhap = new Scanner (System.in);
		int n = nhap.nextInt();
		boolean t=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				t=false;
				break;
			}
		}
		if(t==true) System.out.println("n la so ng to");
		else System.out.println("n kh phai la so ng to");
	}
}
