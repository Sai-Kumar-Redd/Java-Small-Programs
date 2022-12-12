//package Exam2;
//
//class MyException extends  Exception{
//    MyException(String  message){
//        super(message);
//    }
//}
//
//public class Test1 {
//    static void methodA()throws MyException{
//        throw new MyException("A custom exception");
//
//    }
//    static  int methodB (int argument) throws  MyException{
//        int result=1/argument;
//        methodA();
//        return  result;
//    }
//
//    public static void main(String[] args) {
//        try{
//            String output ="the Result is"+methodB(0);
//            System.out.println(output);
//
//        }
//        catch (MyException e){
//            System.out.println(e);
//        }
//    }
//
//}
