package Arrays;

public class MaximumNumbers {
    static void FindMaximumNumber(int [] nums){
        int maxOne=0;
        int maxTwo=0;
        for(int n:nums)
            if(maxOne<n){
                maxOne=maxTwo;
                maxOne=n;

            }
        else if(maxTwo<n){
            maxTwo=n;
            }
        System.out.println(maxOne);
        System.out.println(maxTwo);



    }

    public static void main(String[] args) {
        int arr[]={5,6,73,8,4,9,};
        MaximumNumbers hhd=new  MaximumNumbers();
        hhd.FindMaximumNumber(arr);


    }



}
