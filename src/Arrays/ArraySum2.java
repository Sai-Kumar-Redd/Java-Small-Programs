package Arrays;

public class ArraySum2 {
    public static void main(String[] args) {
        int arr[]=new int[]{7,4,2,7,8,};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            System.out.println(sum);
        }
    }
}
