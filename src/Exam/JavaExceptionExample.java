package Exam;

public class JavaExceptionExample {
    public static void main(String[] args) {
        try{
            int obj =100/0;
            int obj1=10/0;

        }
        catch (ArithmeticException e)
        {
            System.out.println(e)
            ;
            System.out.println("Next..");
        }
    }
}
