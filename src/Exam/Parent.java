package Exam;

public class Parent {
    void msg()throws Exception{
        System.out.println("Parent method is calling");
    }
}
class Child extends Parent{
    void msg(){
        System.out.println("child method is calling");
    }

    public static void main(String[] args) {
        Parent P=new Child();
        try
        {
            P.msg();
        }
        catch (Exception e){

        }
    }
}

