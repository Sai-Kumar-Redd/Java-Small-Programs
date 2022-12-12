package MethodReference;


interface  Sample{
    void say();  // One Abstract Method

}

public class Test {
    public static  void  saySomething()
    {
        System.out.println("It is sample");
    }

    public static void main(String[] args) {
        Sample s=Test:: saySomething;//::Method Reference
        s.say();

    }

}
