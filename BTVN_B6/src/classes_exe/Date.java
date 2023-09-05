package classes_exe;

import java.util.Scanner;

public class Date {
    private Byte year, month, day;
    public Date(){};
    public Date(Byte year, Byte month, Byte day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Byte getYear() {
        return year;
    }
    public void setYear(Byte year) {
        this.year = year;
    }
    public Byte getMonth() {
        return month;
    }
    public void setMonth(Byte month) {
        this.month = month;
    }
    public Byte getDay() {
        return day;
    }
    public void setDay(Byte day) {
        this.day = day;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        year = in.nextByte();
        month = in.nextByte();
        day = in.nextByte();
    }
    public void output(){
        System.out.println("Ngay Sinh : ");
        System.out.print(day);
        System.out.print("/" + month);
        System.out.print("/" +year);
    }
}
