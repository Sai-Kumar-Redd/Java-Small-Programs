package StaticMethod;

class Student{
    String Name;
    String Rollno;
    String Address;
    static  String  College="Reva";

    public Student(String name, String rollno, String address) {
        Name = name;
        Rollno = rollno;
        Address = address;
    }
    static void change(){
        College="IIT";
    }
      void display(){
        System.out.println(Name+" "+Rollno+" "+Address+""+College);
    }
}


public class TestStaticMehod {
    public static void main(String[] args) {


        Student.change();
        Student s = new Student("sai","1","Kurnool");
        s.display();


    }
}