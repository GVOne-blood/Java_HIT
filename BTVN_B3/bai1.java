import java.util.Scanner;

public class bai1 {		// O(n^2) vì đề bài kh bảo cho mảng nguyên
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int n = nhap.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			a[i] = nhap.nextDouble();
		}
		int dem = 0;
		boolean[] b = new boolean[n];
		for (int i = 0; i < n; i++) {
			b[i] = false;
		}
		for (int i = 0; i < n; i++) {
			if (b[i] == false) {
				dem = 0;
				for (int j = 0; j < n; j++) {
					if (a[i] == a[j]) {
						b[j] = true;
						dem++;
					}
				}
				// if (b[i] == true)
				System.out.println("So " + a[i] + " xuat hien " + dem + " lan");
			}
		}
	}
}
