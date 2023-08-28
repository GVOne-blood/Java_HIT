package slove_problem;
import java.util.Scanner;
import classes_exe.Student;
public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien : ");
        n = in.nextInt();
        Student[] hocsinh = new Student[n];
        for(int i=0;i<n;i++){
            hocsinh[i] = new Student();
            hocsinh[i].Input();
        }
        String format = "%-20s  %-10s   %-15s   %-10s   %-20s   %-10s   %-15s   %n ";
        System.out.format(format," Ten "," Lop ", " Khoa "," Ngay vao ", " Ten truong ", " Ngay vao ", "Diem");
        for(int i=0;i<n;i++)
        {
            hocsinh[i].Output();
        }
        
    }
}
