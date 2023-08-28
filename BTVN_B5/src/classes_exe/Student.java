package classes_exe;
import java.util.Scanner;
public class Student {
    private String Name;
    private String Class;
    private Double Score;
    Faculty y = new Faculty();
    School x = new School();
    public Student() {
    };

    public Student(String Name, String Class, Double Score, Faculty y) {
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }

    public String getLove() {   
        return this.Class;
    }

    public void setScore(Double Score) {
        this.Score = Score;
    }
    public Double getScore(){
        return this.Score;
    }
    private String Name_Sub,Date_Sub;
    public void Input(){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        Name = nhap.nextLine();
        System.out.println("Nhap lop  : ");
        Class = nhap.nextLine();
        System.out.println("Nhap ten truong : ");
        Name_Sub = nhap.nextLine();
        System.out.println("Nhap ten ngay vao truong : ");
        Date_Sub = nhap.nextLine();
        x.setName(Name_Sub);
        x.setDate(Date_Sub);
         y.Input();
        System.out.println("Nhap diem so : ");
        Score = nhap.nextDouble();
    }
    public void Output(){
        String format1 = "%-20s  %-10s   %-15s   %-10s   %-20s   %-10s   %-15s   %n ";
        System.out.format(format1,Name,Class,y.getName(),y.getDate(),x.getName(),x.getDate(),String.format("%." + 2 + "f",getScore()));
      //  System.out.println(y.getName()  + "    "   + y.getDate());
        //y.Output();
    }
}
