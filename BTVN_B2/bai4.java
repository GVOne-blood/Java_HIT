import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner (System.in);
		double a = nhap.nextDouble();
		double b = nhap.nextDouble();
		double c = nhap.nextDouble();
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
		    System.out.println("Phuong trinh vo nghiem");
		} else if (delta == 0) {
		    double x = Math.sqrt(-b / (2 * a));
		    System.out.println("Phuong trinh co hai nghiem phan biet: " + x+"  "+-x);
		} else {
		    double x1 = Math.sqrt((-b + Math.sqrt(delta)) / (2 * a));
		    double x2 = Math.sqrt((-b - Math.sqrt(delta)) / (2 * a));
		    System.out.println("Phuong trinh co bon nghiem phan biet: x1=" + x1 + "  x2=" + -x1+"  x3="+ x2+ "  x4="+ -x2);
		}
	}
}
