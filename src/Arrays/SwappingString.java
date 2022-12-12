package Arrays;

public class SwappingString {
    public static void main(String[] args) {
        String a="Sai";
        String  b="Kumar";
        System.out.println("Before Swapping "+a+ " "+b);
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After Swapping th String"+"/n"+a+b);

    }
}
