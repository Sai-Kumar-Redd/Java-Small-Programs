package FunctionalInterface;

 interface Sai{
    void singleAbsMethod();


    default  void printName(){
        System.out.println("T Sai");
    }
    default  void PrintCollege(){
        System.out.println("JNTU");
    }

}

public class FunctionalInterface {

}
