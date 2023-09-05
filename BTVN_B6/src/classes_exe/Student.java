package classes_exe;
import java.util.Scanner;
public class Student extends Person{
    private String Id;
    private String Class;
private String School;

public Student(){};
public Student(String name, Byte age, String address, Date birthDay, String id, String Class, String School)

{
    super(name, address, age, birthDay);
    Id = id;
    this.Class = Class;
    this.School = School;
}
public String getId() {
    return Id;
}
public void setId(String id) {
    Id = id;
}
public String getclass() {
    return Class;
}
public void setClass(String class1) {
    Class = class1;
}
public String getSchool() {
    return School;
}
public void setSchool(String school) {
    School = school;
}
@Override
public void input(){
    Scanner in = new Scanner(System.in);
    super.input();
    Id = in.nextLine();
    Class = in.nextLine();
    School = in.nextLine();
}
    @Override
public void output(){
    super.output();
    System.out.println("Id  : " + Id);
    System.out.println("Class : "  + Class);
    System.out.println("School : "  + School);
}
}
