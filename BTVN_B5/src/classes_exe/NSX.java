package classes_exe;
import java.util.Scanner;
public class NSX {
    private String MaNSX, TenNSX,DcNSX;
    public NSX(){};
    public NSX(String MaNSX, String TenNSX, String DcNSX){
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }
    public void setMaNSX(String MaNSX){
        this.MaNSX = MaNSX;
    }
    public String getMaNSX(){
        return this.MaNSX;
    }
    public void setTenNSX(String TenNSX){
        this.TenNSX  =  TenNSX;
    }
    public String getTenNSX(){
        return this.TenNSX;
    }
    public void setDcNSX(String DcNSX){
        this.DcNSX = DcNSX;
    }
    public String getDcNSX(){
        return DcNSX;
    }
    public void Nhap(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ma NSX : ");
        MaNSX = nhap.nextLine();
        System.out.println("Nhap ten NSX : ");
        TenNSX = nhap.nextLine();
        System.out.println("Nhap dia chi NSX : ");
        DcNSX = nhap.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma NSX : " + MaNSX);
        System.out.println(" Ten NSX : " + TenNSX);
        System.out.println("Dia chi NSX : "  + DcNSX);
    }
}
