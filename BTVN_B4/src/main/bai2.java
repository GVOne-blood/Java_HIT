package main;
import java.util.Scanner;

import classes.hcn;
public class bai2 {
    public static void main(String[] args) {
       // Scanner nhap = new Scanner(System.in);
        hcn hinh = new hcn();
        hinh.nhap();
        System.out.println("S = "+ hinh.dienTich());
        System.out.println("C = " + hinh.chuVi());
        hinh.veHCN();
    }
}
