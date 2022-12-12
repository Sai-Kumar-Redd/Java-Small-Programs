import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
                System.out.println("Enter n number");
            int n=scanner.nextInt();
        int i,  sum = 0;
        for (i = 1; i <= n; ++i) {
            sum = sum + i;
        }

        {

            System.out.println("Sum of the  first 10 Natural Number " + sum);

        }

    }
}

