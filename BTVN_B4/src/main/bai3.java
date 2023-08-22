package main;

import classes.SinhVien;

public class bai3 {
    public static void main(String[] args) {
        SinhVien[] sv = new SinhVien[5];
        for (int i=0;i<5;i++)
        {
            sv[i] = new SinhVien();
            sv[i].nhap();
        }
        String format1 = " %-10s   %-30s     %-15s    %-15s   %-15s    %-15s   %n";
        System.out.format(format1,"Ma Sinh Vien","Ho Ten","Diem Toan",  "Diem Ly" ,"Diem Hoa","Diem TB");
        for (int i=0;i<5;i++)
        {
            sv[i].DiemTB();
            sv[i].xuat();
        }
    }
}
