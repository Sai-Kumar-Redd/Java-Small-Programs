import java.util.Scanner;

public class  FibonnaciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,numbers;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter from 1 to numbers");
        numbers =scanner.nextInt();
        System.out.println(n1+" \n"+n2);

        for(int i=3;i<=numbers;i++){
          n3=n1+n2;
          System.out.println(n3);
          n1=n2;
          n2=n3;
        }
    }
}
