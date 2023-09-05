package main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes_exe.Student;

public class Bai2 {
    public static void main(String[] args) {
        List <Student> hs = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
            for (int  i = 0; i<n;i++)
            {
              Student hocSinh = new Student();
              hocSinh.input();
                hs.add(i,hocSinh);
            }
            for (int i=0;i<n;i++){
                hs.get(i).output();
            }
            
    }
}
