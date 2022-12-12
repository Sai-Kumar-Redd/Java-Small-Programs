package Arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int arr[] = new int[]{2,4,5,78,9,6,3};
        Arrays.sort(arr);
        System.out.println("Elements in Sorting");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
    }
}
