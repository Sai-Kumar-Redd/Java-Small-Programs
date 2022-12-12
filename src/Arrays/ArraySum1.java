package Arrays;

import java.util.stream.IntStream;

public class ArraySum1 {
    public static void main(String[] args) {
        int[]arr=new int[]{4,5,687,};
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);
    }
}
