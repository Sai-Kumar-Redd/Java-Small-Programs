package Exam2;

interface  FunctionalInterface{
    public  int addMethod(int a,int b)
;}

public class ClassA {
    public static void main(String[] args) {
        FunctionalInterface sum=(a,b)->a+b;
        System.out.println("Result"+sum.addMethod(12,100));
    }
}
