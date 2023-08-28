package classes_exe;

import java.util.Scanner;

public class PhongMay {
    private
            String MaPhong,TenPhong;
     private        Double DienTich;
            QuanLy x = new QuanLy();
        private     int n;
             May[] y;
    public PhongMay(){};
    
    public PhongMay(String MaPhong, String TenPhong, Double DienTich,QuanLy x,May[] y,int n)
    {
        this.DienTich = DienTich;
        this.MaPhong = MaPhong;
        this.TenPhong = TenPhong;
        this.n = n;
        this.x = x;
        this.y = y;
    }
public void setMaPhong(String MaPhong){
    this.MaPhong = MaPhong;
}
public String getMaPhong(){
    return this.MaPhong;
}
public void setTenPhong(String TenPhong){
    this.TenPhong = TenPhong;
}
public String getTenPhong(){
    return this.TenPhong;
}
public void setDienTich(Double DienTich)
{
    this.DienTich  = DienTich;
}
public Double getDienTich(){
    return this.DienTich;
}
 Scanner in = new Scanner(System.in);
public void Nhap(){
   
    System.out.println("Nhap ma phong : ");
    MaPhong = in.nextLine();
    System.out.println("Nhap ten phong : ");
    TenPhong = in.nextLine();
    System.out.println("Dien tich phong : ");
    DienTich = in.nextDouble();
    System.out.println("So luong may : ");
    n= in.nextInt();
    y= new May[n];
    x.Nhap();
    for(int i=0;i<n;i++)
    {
        y[i] = new May();
        y[i].Nhap();
    }

}
public void Xuat(){
    System.out.println("Ma phong : "+ MaPhong);
    System.out.println(" Ten Phong : " + TenPhong);
    System.out.println("Dien tich phong : " + DienTich);
    x.Xuat();
    System.out.println("Phong co " + n + " may duoc tong hop duoi bang sau :");
    String format = "%-30s      %-40s       %-30s       %n";
    System.out.format(format,"Ma may","Ten may","Tinh trang");
    for (int i=0;i<n;i++)
    {
        y[i].Xuat();
    }
}
}