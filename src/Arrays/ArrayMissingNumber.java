package Arrays;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        int  arr[]=new int[]{1,2,3,4,5,6,7,9,10};
        int sum=(10*11)/2;
        int actualsum=0;
          for(int i=0;i<arr.length;i++){
          actualsum=actualsum+arr[i];

}
    System.out.println("Missing number"+(sum-actualsum));

    }
}
