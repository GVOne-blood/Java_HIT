package classes;

import java.util.Scanner;

public class Person {
    private String name, gender;
    private int age;
    public Person(){};
    public Person(String Name, int Age, String Gender)
    {
        name = Name;
        age = Age;
        gender = Gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        sc.nextLine();
        gender = sc.nextLine();
    }
    public void output(){
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
    }
    
}
