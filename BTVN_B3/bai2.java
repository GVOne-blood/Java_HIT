import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();

		double[] a = new double[n];
		double[] b = new double[n+1];
		for (int i = 0; i < n; i++) {
			a[i] = nhap.nextDouble();
		}
		System.out.print("nhap vi tri can them : ");
		int them = nhap.nextInt();
		System.out.print("nhap gia tri can them : ");
		double gt = nhap.nextDouble();
		for(int i=0;i<them-1;i++)
			b[i]=a[i];
		b[them-1]=gt;
		for(int i=them-1;i<n;i++)
		{
			b[i+1]=a[i];
		}
		
		for (int i = 0; i <= n; i++)
			System.out.print(b[i] + " ");
		System.out.print("nhap vi tri can xoa : ");
		int xoa = nhap.nextInt();
		double[] c = new double[n-1];
		for(int i=0;i<xoa-1;i++)
		{
			c[i]=a[i];
		}
		for(int i=xoa-1;i<n-1;i++)
		{
			c[i]=a[i+1];
		}
		for (int i = 0; i <n-1; i++)
			System.out.print(c[i] + " ");
		
	}
	}

