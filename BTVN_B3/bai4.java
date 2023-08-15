import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String[] a = new String[3];
        String[] b = new String[3];
        int dem = 0;
        int k = 0;
        do {
            a[k] = nhap.next();
            b[k] = a[k];
          // System.out.println(a[k]);
            k++;// System.out.println(k);
            dem++;
        } 
        while (a[k-1].isEmpty()&&  k<4);
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

        //dnhap.close();
    }
}
