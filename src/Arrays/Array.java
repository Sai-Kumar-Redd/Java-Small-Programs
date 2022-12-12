package Arrays;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<String>();
        al.add("Sai");
        al.add("Kumar");
        al.forEach((n->System.out.println(n)));//Lambda Expression
    }
}
