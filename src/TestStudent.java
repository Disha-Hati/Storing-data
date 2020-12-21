/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Disha
 */
class Student{
    private String name;
    public Student(){
        name="";
    }
    public Student(String name){
        this.name=name;
    }
    public Student(Student obj){
        this.name=obj.getName();
    }
    public void displayName(){
        System.out.println(name);
    }
    public void changeName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student obj=new Student("Ram");
        obj.displayName();
    }
    
}
