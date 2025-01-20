
import java.util.Scanner;

public class InvertedAndRotateHalfTraingle {
    public static void invertedAndRotateHalfTriangle(int row){
        for(int i = 1; i<=row ; i++)
        {
         for(int j = row; j>=1 ; j--)
         {
             if(j>i)
             {
                 System.out.print(" ");
             }
             else{
                 System.out.print("*");
             }
         }
         System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want");
       int row = sc.nextInt();
       invertedAndRotateHalfTriangle(row);
       
    }
}
