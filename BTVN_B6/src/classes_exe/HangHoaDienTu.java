package classes_exe;

import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh; 
    private int congSuat;
    public HangHoaDienTu(){};
    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, VatLieu[] dsVL,int thoiGianBaoHanh, int congSuat)
    {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }
    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public int getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        thoiGianBaoHanh = sc.nextInt();
        congSuat = sc.nextInt();
    }
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Thoi Gian Bao Hanh : " + thoiGianBaoHanh);
        System.out.println("Cong Suat : " + congSuat);
    }
}
