import java.util.Scanner;

public class SolidRhombusPatter {
    public static void solidRhombusPattern(int row)
    {
          for(int i = row ; i>=1; i--)
          {
            for(int j =1;j<i ; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=row; k++)
            {
                System.out.print("*");
            }
            System.out.println();
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want to print");
        int row = sc.nextInt();
        solidRhombusPattern(row);   
    }
}
