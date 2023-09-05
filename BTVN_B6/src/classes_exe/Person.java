package classes_exe;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected Byte age;
    Date birthDay = new Date();
    public Person(){};
    public Person(String name, String address, Byte age, Date birthDay)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }
       public void input(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextByte();
        in.nextLine();
        address = in.nextLine();
        birthDay.input();
       }
       public  void output(){
        System.out.println("Name : " + name);
        System.out.println("Age : "  + age);
        System.out.println("Address : " + address);
        birthDay.output();
       }}
