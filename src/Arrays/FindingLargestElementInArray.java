package Arrays;

public class FindingLargestElementInArray {
    public static void main(String[] args) {
        int arr[]=new int[]{ 0,3,5,6,3,5,8,67437,7,9};
        int max=arr[2];
        System.out.println("This is the Highest Number in the Array");


        for(int i=0;i<arr.length;i++) {

            if (arr[i] > max)
                max = arr[i];
        }


        System.out.println(max);
    }
}
