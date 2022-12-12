package FunctionalInterface;


 interface Sample{
     int Calculate(int val);//Abstract Body Does not have Body



        }

public class Main {
    public static void main(String[] args) {

        Sample s=( val)->val*50;
        int ans= s.Calculate(5);
        System.out.println(ans);

        }

    }

