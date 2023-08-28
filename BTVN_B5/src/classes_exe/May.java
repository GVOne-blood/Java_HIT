package classes_exe;

import java.util.Scanner;

public class May {
    private String MaMay, TenMay,TinhTrang;
    public May(){};
    public May(String MaMay, String TenMay, String TinhTrang)
    {
        this.MaMay = MaMay;
        this.TenMay =TenMay;
        this.TinhTrang = TinhTrang;
    }
    public void setMaMay(String MaMay){
        this.MaMay = MaMay; 
    }
    public String getMaMay(){
        return this.MaMay;
    }
    public void setTenMay(String TenMay)
    {
        this.TenMay = TenMay;
    }
    public String getTenMay(){
        return this.TenMay;
    }
    public void setTinhTrang(String TinhTrang){
        this.TinhTrang = TinhTrang;
    }
    public String getTinhTrang(){
        return this.TinhTrang;
    }
    public void Nhap(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ma may : ");
        MaMay = in.nextLine();
        System.out.println("Nhap ten may : ");
        TenMay = in.nextLine();
        System.out.println("Tinh trang cua may : ");
        TinhTrang = in.nextLine();
    }
    public void Xuat(){
        String format = " %-30s     %-40s        %-30s    %n";
        System.out.format(format,MaMay,TenMay,TinhTrang);
        // System.out.println(MaMay);
        // System.out.println(TenMay);
        // System.out.println(TinhTrang);
    }
}

