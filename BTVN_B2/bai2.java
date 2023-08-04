import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n;
		do {
			System.out.println("nhap gia tri cua n :");
			n= nhap.nextInt();
		}
		while (n<=0);
		double s=1;  long p=1,gt=1;
			for (int i=2;i<=n;i++) 
				{
				s+=1.0/i;
				for(int j=1;j<=i;j++) gt*=j;
				p+=gt;
				gt=1;
				}
			System.out.println("a)   S="+s);
			System.out.print("b)   P=" + p);
	}
	

}
