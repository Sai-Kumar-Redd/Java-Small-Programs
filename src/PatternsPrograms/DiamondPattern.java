package PatternsPrograms;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row=scanner.nextInt();
        for(int i=1;i<row;i++){
            for(int j=i;j<=row;j++){
                System.out.print(" ");

            }
            for(int j=1;j<i;j++){
                System.out.print("*");

            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print( " ");
            }
            for(int j=i;j<row;j++){
                System.out.print("*");

            }
            for(int j=i;j<=row;j++) {
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
