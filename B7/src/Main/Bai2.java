package Main;

import java.util.Scanner;

import classes.Classroom;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Classroom lop = new Classroom();
        lop.input();
        lop.output();
         String name = sc.nextLine();
          lop.searchByName(name);
    }
}
