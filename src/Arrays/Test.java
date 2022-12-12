package Arrays;

public class Test {
    static void PushingZeroToLast(int[]arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if(arr[i]!=0)
               arr[count++]=arr[i];

        while(count<0)
            arr[count++]=0;



    }

    public static void main(String[] args) {
        int []arr={7,0,6,8,5,0,6,7,0};
        int n=arr.length;
        PushingZeroToLast(arr,n);
        System.out.println("After pushing Zero to Last");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }



    }
}
