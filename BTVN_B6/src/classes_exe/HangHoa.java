package classes_exe;
import java.util.Scanner;

import classes_exe.VatLieu;
public class HangHoa {
    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    VatLieu[] dsVL;
    public HangHoa(){};
    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL){
        this.maHang =maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public float getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        maHang  = sc.nextLine();
        tenHang = sc.nextLine();
        soLuong = sc.nextFloat();
        donGia = sc.nextFloat();
        sc.nextLine();
    }
      public float tongTien(float soLuong, float donGia)
    {
        return soLuong*donGia;
    }
    public void xuat(){
        System.out.println("Ma Hang : " + maHang);
        System.out.println("tenHang : " + tenHang);
        System.out.println("soLuong : " + soLuong);
        System.out.println("Don Gia : " + donGia);
        System.out.println("Tong tien vat lieu : " + tongTien(soLuong, donGia));
    }
   
}
