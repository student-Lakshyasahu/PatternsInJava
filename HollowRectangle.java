
import java.util.Scanner;

public class HollowRectangle
{
    public static void  hollowRec(int row , int column)
    {
         for(int i = 1; i<= row ;i++)
         {
            for(int j = 1 ; j<=column ; j++)
            {
                if(i==1||i==row||j==1||j==column)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want");
        int rows = sc.nextInt();
        System.out.println("Enter how many column you want");
        int column = sc.nextInt();
        hollowRec(rows,column);
    }
}