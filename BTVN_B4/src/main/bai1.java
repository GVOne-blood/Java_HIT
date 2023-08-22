package main;
import java.util.Scanner;
import classes.book;
public class bai1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        String MaSach,TenSach,TacGia,NhaXuatBan;
         book sach1 = new book();
      //  MaSach = input.next();
       book[] sach = new book[5];
        for (int i=0;i<5;i++)
        {
            sach[i] = new book();
            sach[i].dauvao();
        
        }
        String format = " %-10s  %-30s  %-20s  %-20s %n";

        System.out.format(format,"Mã Sách","Tên Sách","Tác Giả","Nhà Xuất Bản");
        for(int i=0;i<5;i++)
        {
         sach[i].out();
            }
    }
}
