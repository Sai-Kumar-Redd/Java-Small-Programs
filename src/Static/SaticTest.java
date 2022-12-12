package Static;

import java.util.stream.StreamSupport;

class Student{
    int Id;
    String Name;
    String Gender;
    String Address;
    static  String College="REVA";

    public Student(int id, String name, String gender, String address) {
        Id = id;
        Name = name;
        Gender = gender;
        Address = address;
    }
    void display(){
        System.out.println("StudentID:"+Id+"\n "+"StudentName:"+Name+"\n "+Gender+" "+Address+" "+College);
}


}
public class SaticTest {
    public static void main(String[] args) {
        Student s=new Student(1,"Sai Kumar","Male","Kurnool");
        Student s1=new Student(2,"Venkat","Male","Ongole");
        s.display();
        s1.display();
    }
}
