import java.util.*;
public class NumberPyramid {
    public static void numberPattern(int row)
    {
         int num =1;
         for(int i = row ; i>=1; i--)
         {
            for(int j = 1; j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = row; k>=i ; k--)
            {
                System.out.print(num+" ");
            }
            num++;
            System.out.println();
         }
    }
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many row you want to print");
        int row = sc.nextInt();
        numberPattern(row);
     }
}
