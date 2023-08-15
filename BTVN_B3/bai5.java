import java.util.Scanner;

public class bai5 { // chỉ áp dụng đc cho tên có 3 từ :)))
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		String[] a = new String[3];
		String[] b = new String[3];
		for (int i = 0; i < 3; i++) {
			a[i] = nhap.next();
			b[i] = a[i];
		}
		for (int i = 0; i < 3; i++) {
			a[i] = a[i].toLowerCase();
			b[i] = b[i].toUpperCase();
			a[i] = a[i].replace(a[i].charAt(0), b[i].charAt(0));
			if (i == 2) {
				System.out.print(a[i]);
			} else {
				System.out.print((a[i] + " "));
			}
		}

	}
}
