package classes;
import java.util.Scanner;
public class SinhVien {
    private long maSinhVien;
    private String hoTen;
    private double diemToan, diemLy, diemHoa,diemTB;
   
   public  SinhVien(){};
    public SinhVien(Long maSinhVien, String hoTen, Double diemToan, Double diemLy, double diemHoa){
        this.maSinhVien = maSinhVien;
        this.hoTen =  hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public void setMaSinhVien(long maSinhVien)
    {
        this.maSinhVien =maSinhVien;
    }
    public long getMaSinhVien(){
        return this.maSinhVien;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setDiemToan(double diemToan)
    {
        this.diemToan = diemToan;
    }
    public Double getDiemToan(){
        return this.diemToan;
    }
    public void setDiemLy(double diemLy){
        this.diemLy = diemLy;
    }
    public double getDiemLy(){
        return this.diemLy;
    }
    public void setDiemHoa(double diemHoa)
    {
        this.diemHoa = diemHoa;
    }
    public double getDiemHoa(){return this.diemHoa;}
    public void nhap(){
        Scanner input = new Scanner(System.in);
        maSinhVien = input.nextLong();
        input.nextLine();
        hoTen = input.nextLine();
        diemToan = input.nextDouble();
        diemLy = input.nextDouble();
        diemHoa = input.nextDouble();
    }
    public double DiemTB(){
        diemTB = (diemToan+diemLy+diemHoa)/3.0;
        return diemTB;
    }
    public void setdiemTB(double diemTB)
    {
        this.diemTB =  diemTB;
    }
    public double getdiemTB(){
        return diemTB;
    }
    public void xuat(){
        String format = " %-10d   %-30s     %-15f    %-15f   %-15f    %-15f  %n";
        System.out.format(format, maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB);

    }
}
