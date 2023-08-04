import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		int chanh,tao,le;
		do{
			 chanh = nhap.nextInt();
		tao = nhap.nextInt();
		 le = nhap.nextInt();}
		while (chanh<=0||tao<=1||le<=3);
		 long sum = 0;
		for (int i = chanh; i > 0; i--) {
			if ((2 * i <= tao) && (4 * i <= le)) {
					sum=i+2*i+4*i;
				System.out.print("vay tong so qua toi da la: " + sum);
				break;
			}
		}

	}
}
