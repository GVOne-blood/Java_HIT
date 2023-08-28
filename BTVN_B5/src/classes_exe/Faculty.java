package classes_exe;
import java.util.Scanner;
public class Faculty {
    private String Name, Date;
    private School x = new School();
    public Faculty(){};
    public Faculty(String Name, String Date,School x)
    {
        this.Name = Name;
        this.Date = Date;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setDate(String Date)
    {
        this.Date = Date;
    }
    public String getDate(){
        return this.Date;
    }
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten khoa : ");
        Name = nhap.nextLine();
        System.out.println("nhap ngay vao khoa : ");
        Date = nhap.nextLine();
    }
       
    public void Output(){
        System.out.println("Ten khoa : " + Name);
        System.out.println("Ngay vao khoa : " + Date);
        System.out.println("Ten truong : " + x.getName());
        System.out.println("Ngay vao truong : " + x.getDate());
    }
}
