import java.util.Scanner;

public class ButterflyPattern {
    public static void butterflyPattern(int row)
    {
          for(int i = 1; i<=row ; i++)
          {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print("*");
            }
            for(int k = 1; k<=(2*(row-i)); k++)
            {
                System.out.print(" ");
            }
            for(int l = 1; l<=i ; l++)
            {
                System.out.print("*");
            }
            System.out.println();
          }
          for(int i = row; i>=1 ; i--)
          {
            for(int j = 1; i>=j ; j++)
            {
                System.out.print("*");
            }
            for(int k = 1; k<=(2*(row-i)); k++)
            {
                System.out.print(" ");
            }
            for(int l = 1; i>=l ; l++)
            {
                System.out.print("*");
            }
            System.out.println();
          }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter how many rows you want to print");
       int rows = sc.nextInt();
       butterflyPattern(rows); 
    }
}
