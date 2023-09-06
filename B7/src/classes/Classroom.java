package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    private int classId;
    private int numberOfStudent;
    ArrayList<Student> listStudent = new ArrayList<>();
    public Classroom(){};
    public Classroom(int classId, int numberOfStudent, ArrayList listStudent){
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
    }
    public int getClassId() {
        return classId;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        classId = sc.nextInt();
        numberOfStudent  = sc.nextInt();
        for(int i=0;i<numberOfStudent;i++){
        Student hs = new Student();
        hs.input();
        listStudent.add(hs);
    }
        
    }
    public void output(){
        System.out.println("classId : " + classId);
        System.out.println("numberOfStudent : " + numberOfStudent);
        for(int i=0;i<listStudent.size();i++)
        {
            System.out.println("Hs thu : " + (i+1) );
            listStudent.get(i).output();
        }

    }
    public ArrayList<Student> searchByName(String name)
    {

        for(int i=0;i<listStudent.size();i++){
        if (listStudent.get(i).getName().contains(name)) 
            return listStudent;
        }
        return null;
        
    }
}

