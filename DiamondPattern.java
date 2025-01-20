
import java.util.Scanner;

public class DiamondPattern {
    public static void diamondPattern(int row)
    {
        int star= 1;
        for(int i = 1; i<=row; i++)
        {
           
            for(int j = 1; j<=(row-i); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=star ; k++)
            {
              System.out.print("*");
            }
            for(int l = 1; l<=(row-i); l++)
            {
                System.out.print(" ");
            }
            star+=2;
            System.out.println();
        }
        star-=2;
        for(int i = row; i>=1; i--)
        {
           
            for(int j = 1; j<=(row-i); j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=star ; k++)
            {
              System.out.print("*");
            }
            for(int l = 1; l<=(row-i); l++)
            {
                System.out.print(" ");
            }
            star-=2;
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row you want to print pattern");
        int row = sc.nextInt();
        diamondPattern(row);
        
    }
}
