package classes;
import java.util.Scanner;
 public class book {
    private String masach,tensach,tacgia,nhaxuatban;
    public void dauvao(){
        Scanner input = new Scanner(System.in);
        masach = input.nextLine();
        tensach = input.nextLine();
        tacgia = input.nextLine();
        nhaxuatban = input.nextLine();

    }
    
    //phuong thuc khoi tao khong doi so
    public book(){};
    //phuong thuc khoi tao co doi so
    public book(String masach, String tensach, String tacgia, String nhaxuatban)
    {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.nhaxuatban = nhaxuatban;
    }
    //phuong thuc getter setter
    public String getMasach(){
        return this.masach;
    }
      public void setMasach(String masach)
    {
        this.masach = masach;
    }
    public void setTensach(String tensach)
    {
        this.tensach = tensach;
    }
    public String getTensach(){
        return this.tensach;
    }
    public void setTacgia(String tacgia)
    {
        this.tacgia = tacgia;
    }
   public String getTacgia()
   {
    return this.tacgia;
   }
   public void setNhaxuatban(String nhaxuatban)
   {
    this.nhaxuatban = nhaxuatban;
   }
   public String getNhaxuatban(){
    return this.nhaxuatban;

   }
   public void out()
   {
      String format ="%-10s   %-30s   %-20s   %-20s   %n";
     System.out.format(format,this.masach, this.tensach,this.tacgia,this.nhaxuatban);
   }
}
