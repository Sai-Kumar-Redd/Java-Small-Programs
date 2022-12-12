package PatternsPrograms;

import java.util.Scanner;

public class IncreasingTraingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row=scanner.nextInt();
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }}
