import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String[] a = new String[6];
        String[] b = new String[6];
        int dem = 0;
        int k = 0;
        do {
            a[k] = nhap.next();
            b[k] = a[k];
            dem++;
            k++;
        } while (!a[k - 1].isEmpty() && k < 6);

        for (int i = 0; i < dem; i++) {
            a[i] = a[i].toLowerCase();
            b[i] = b[i].toUpperCase();
            a[i] = a[i].replace(a[i].charAt(0), b[i].charAt(0));
            if (i == dem - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print((a[i] + " "));
            }
        }

        nhap.close();
    }
}
