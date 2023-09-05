package main;

import java.util.ArrayList;
import java.util.Scanner;

import classes_exe.HangHoaDienTu;
import classes_exe.HangHoaGiaDung;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("nhap cac in4 hang hoa dien tu : ");
        ArrayList <HangHoaDienTu> DT = new ArrayList<>();
        ArrayList <HangHoaGiaDung> GD = new ArrayList<>();
        for (int i=0;i<n;i++){
            HangHoaDienTu dt = new HangHoaDienTu();
            dt.nhap();
            DT.add(i,dt);
        }
        System.out.println("nhap cac in4 hang hoa gia dung : ");
        for(int i=0;i<n;i++)
        {
            HangHoaGiaDung gd = new HangHoaGiaDung();
            gd.nhap();
            GD.add(i,gd);
        }
        System.out.println("hang hoa dien tu : ");
        for(int i=0;i<n;i++){
            DT.get(i).xuat();
        }
        System.out.println("hang hoa gia dung : ");
        for (int i=0;i<n;i++)
        {
            GD.get(i).xuat();
        }
    }
}
     