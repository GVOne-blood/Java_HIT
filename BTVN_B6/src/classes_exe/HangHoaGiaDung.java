package classes_exe;

import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
    private String chucNang;
    public HangHoaGiaDung(){};
    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, VatLieu [] dsVL, String chucNang){
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }
    public void setChucNang(String chucNang){
        this.chucNang = chucNang;
    }
    public String getChucNang(){
        return this.chucNang;
    }
    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
      //  sc.nextLine();
        chucNang = sc.nextLine();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Chuc Nang  : " + chucNang);
    }
}
