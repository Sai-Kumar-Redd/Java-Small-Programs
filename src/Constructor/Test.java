package Constructor;

class Employee{
    String Name;
    String  Email__Id;
    int Rollno;


      Employee(){
        System.out.println("It is a  Default  Constructor"); //we Can call Pramaterized Constructor by this
                                                                //keyword passing parametrs in this passing values
        System.out.println(Name);



    }

    public Employee(String name, String email__Id, int rollno) {// we can call Default constructor  by using this  Keyword
        this();
        System.out.println("It is a Parameterized Constructor");
        System.out.println("This is the Name:" + name);
        System.out.println("This is the Email:" + email__Id);
        System.out.println("This is the Roll No:" + rollno);
    }
//    }public Employee() {
//        this(String  NAm);
//        System.out.println("It is a Parameterized Constructor");
//        System.out.println("This is the Name:"+Name);
//        System.out.println("This is the Email:"+Email__Id);
//        System.out.println("This is the Roll No:"+Rollno);
//    }



}


public class Test {
    public static void main(String[] args) {
        Employee test2=new Employee();
        Employee test=new Employee("sai","tsaikumareddy5@gmail.com",5);
       // Employee test1=new Employee("saik","tds",'8');


    }
}
