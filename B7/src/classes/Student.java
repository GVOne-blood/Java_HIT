package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    private int id;
    Address address = new Address();
    private double gpa;
    public Student(){};
    public Student(String name, int age, String gender, int Id, Address address, Double Gpa){
        super(name, age, gender);
        id = Id;
        gpa = Gpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        id = sc.nextInt();
        address.input();
        gpa =sc.nextDouble();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("id : " + id);
        address.output();
        System.out.println("gpa : " + gpa);
    }

}
