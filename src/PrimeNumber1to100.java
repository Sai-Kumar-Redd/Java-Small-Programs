import java.util.Scanner;


public class PrimeNumber1to100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n Numbers");
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}


