package Palindrome;

import java.util.Scanner;

public class PalindromeStringR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str, reverse = " ";
        str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
            //System.out.println(rev);


         if(reverse.equalsIgnoreCase(reverse)) {

                System.out.println( "It is Palindrome String");
            } else {
                System.out.println ("It is Not a Palindrome");
            }


        }
    }

