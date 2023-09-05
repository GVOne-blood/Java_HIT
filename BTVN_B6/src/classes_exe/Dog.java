package classes_exe;
import  java.util.Scanner;
public class Dog extends Animal {
    private String character;
    public Dog(){};
    public Dog(String name, Byte age, Float weight, String character)
    {
        super(name, age, weight);
        this.character = character;
    }
    public void setCharacter(String character){
        this.character = character;
    }
    public String getCharacter(){
        return this.character;
    }
    @Override
    public void input(){
        Scanner in = new Scanner(System.in);
        character = in.nextLine();
    }
    @Override
    public void output(){
        System.out.println(character);
    }
    @Override
    public void tiengKeu(){
        System.out.println("Gau Gau");
    }
}
