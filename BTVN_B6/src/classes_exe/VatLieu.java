package classes_exe;

import java.util.Scanner;

public class VatLieu {
    private String ten;
    private String mauSac;
    private int doCung;
    public VatLieu(){};
    public VatLieu(String ten, String mauSac, int doCung){
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public int getDoCung() {
        return doCung;
    }
    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        mauSac = sc.nextLine();
        doCung = sc.nextInt();
    }
    public void xuat(){
        System.out.println("Ten  : " + ten);
        System.out.println("mauSac"  + mauSac);
        System.out.println("doCung : "  + doCung);
    }
}
