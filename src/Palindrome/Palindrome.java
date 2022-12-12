package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r, sum = 0,temp;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scanner.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum==temp) {
            System.out.println("It is a Palindrome Number");
        }
            else{
                System.out.println("It is Not a Palindrome  NUmber");

            }
        }

    }

