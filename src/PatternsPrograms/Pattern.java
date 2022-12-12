package PatternsPrograms;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("Please Enter Number of Rows");
        int rows=scanner.nextInt();
        for (int i=0;i<rows;i++)//Loop
        {
            for(int j=0;j<=i;j++)///InnerLoop
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
