package classes_exe;

import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String preferences;
    private String ownerName;
    public Cat(){};
    public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName){
        super(ownerName, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getPreferences() {
        return preferences;
    }
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    @Override
    public void input()
    {
        Scanner in = new Scanner(System.in);
        color = in.nextLine();
        preferences = in.nextLine();
        ownerName = in.nextLine();
    }
    @Override
    public void output(){
        System.out.println(color);
        System.out.println(preferences);
        System.out.println(ownerName);
    }
    @Override
    public void tiengKeu(){
        System.out.println("meow, meow");
    }
    
}
