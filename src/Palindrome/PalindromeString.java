package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scanner.nextLine();
//        String str="Sai Kumar";
        String rev="";


        for(int i= str.length()-1;i>=0;i--){
            rev=rev+ str.charAt(i);
        }
        System.out.println(rev);
    }
}
