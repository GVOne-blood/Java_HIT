import java.util.Scanner;
public class bai3 {
	static void sortnb(double[] a, int n)
	{
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j])
				{
					double tg = a[i];
					a[i]=a[j];
					a[j]=tg;
				}
			}
	}
	}
public static void main(String[] args) {
	Scanner nhap = new Scanner (System.in);
	int n = nhap.nextInt();
	double[] a = new double [n]; 
	for(int i=0;i<n;i++)
	{
		a[i] = nhap.nextDouble();
	}
	bai3.sortnb(a,n);
	for(int i=0;i<n;i++)
		System.out.print(a[i] + " ");
}
}
