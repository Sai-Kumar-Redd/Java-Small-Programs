package PatternsPrograms;

public class SquarePattern {
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<=row;i++)  //row
        {
            for( int j=0;j<=row;j++)//Coloum
            {
                System.out.print(" *   ");

            }
            System.out.println();
        }
    }
}
