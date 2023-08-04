
import java.util.Scanner;
public class bai1 {
	
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n= nhap.nextInt();
		long s = n*n;
		//System.out.println(s);
		System.out.print(" ");
		for (int i = 1; i <= s; i++) {
			if ((i >= n) && (s - i >= n)) {
				if ((i % n == 0)) {
					System.out.println("*");}
				if ((i - 1) % n == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			else System.out.print("*");
				
			}
		
	}
}
