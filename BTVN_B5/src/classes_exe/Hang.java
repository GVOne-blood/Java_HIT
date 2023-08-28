package classes_exe;
import java.util.Scanner;
public class Hang {
    private String MaHang, TenHang;
    private NSX x = new NSX();
    public Hang(){};
    public Hang(String MaHang, String TenHang, NSX x)
    {
        this.MaHang = MaHang;
        this.TenHang = TenHang;
    }
    public void setTenHang(String TenHang){
        this.TenHang = TenHang;
    }
    public String getTenHang(){
        return this.TenHang;
    }
    public void setMaHang(String MaHang){
        this.MaHang = MaHang;
    }
    public String getMaHang(){

        return this.MaHang;
    }
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma hang : ");
        MaHang = nhap.nextLine();
        System.out.println("Nhap ten hang : ");
        TenHang = nhap.nextLine();
        x.Nhap();
    }
    public void Xuat(){
        System.out.println("Ma hang : " + MaHang);
        System.out.println("Ten hang : " + TenHang);
        x.Xuat();
    }
}
