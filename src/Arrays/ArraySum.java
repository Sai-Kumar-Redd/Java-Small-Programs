package Arrays;

//import javax.imageio.stream.ImageInputStream;

class ArraySum {


   static int[] arr = {4, 5, 6};

         static int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        return sum;
    }



        public static void main(String[]args){
        System.out.println(sum());

        }
    }

