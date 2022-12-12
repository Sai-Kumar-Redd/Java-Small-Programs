package PatternsPrograms;

import java.util.Scanner;

public class DecreasingTraingle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows=scanner.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for (int j=i;j<=rows;j++)
            {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
