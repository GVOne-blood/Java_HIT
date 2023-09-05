package classes_exe;

import java.util.Scanner;

public class Animal {
    protected String name;
    protected Byte age;
    protected Float weight;
    public Animal(){};
    public Animal(String name , Byte age, Float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }
    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextByte();
        weight = in.nextFloat();
    }
    public void output(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
    }
    public void tiengKeu(){
        System.out.println("animalww, animalww!!");
    }
}