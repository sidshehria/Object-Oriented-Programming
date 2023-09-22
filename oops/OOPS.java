

class Pen{
    String color;
    String type; //ball or gel

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    // public void printInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);

    // }
    //non parameterized constructor
//    Student() {
//        System.out.println("Constructor Called");
//    }

    //parametrized constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age = s2.age;
    // }
    // Student(){

    // }

    //polymorphism
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name + "\n" + age);
    }

}

public class OOPS {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type  = "gel";


        pen1.write();
        pen1.printColor();
        pen1.printType();

        Student s1 = new Student();
       s1.name = "Siddharth";
       s1.age = 20;

    //    Student s2 = new Student(s1);

    //     s2.printInfo();

        s1.printInfo(s1.name, s1.age);
        
    }

}
