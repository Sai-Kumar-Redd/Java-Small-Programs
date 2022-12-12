import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i, n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  n Number ");
        n = sc.nextInt();
        for (i = 2; i <= n/2; i++) {
            if (n % i == 0) {

                count++;
            }
        }


            if (count == 2)
                System.out.println("It is a   Not Prime Number");
            else {
                System.out.println("It is a   Prime Number");
            }

        }
    }

