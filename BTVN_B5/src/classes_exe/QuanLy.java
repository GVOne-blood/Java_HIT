package classes_exe;

import java.util.Scanner;

public class QuanLy {
    private String MaQL, HoTen;
    public QuanLy(){};
    public QuanLy(String MaQL, String HoTen){
        this.MaQL = MaQL;
        this.HoTen = HoTen;
    }
    public void setMaQL(String MaQL){
        this.MaQL = MaQL;
    }
    public String getMaQL(){
        return this.MaQL;
    }
    public void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }
    public String getHoTen(){
        return this.HoTen;
    }
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma quan ly : ");
        MaQL = in.nextLine();
        System.out.println("Ho ten : ");
        HoTen = in.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma quan ly : " + MaQL);
        System.out.println("ho ten : " + HoTen);
    }
}
