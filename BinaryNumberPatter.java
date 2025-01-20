import java.util.Scanner;

public class BinaryNumberPatter {
    public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many rows you want to print");
    int row = sc.nextInt();
    int num =1;
    for(int i = 1; i<=row; i++)
    {
        for(int j = 1; j<=i ; j++)
        {
            if(num==1)
            {
                System.out.print(num-- +" ");
            }
            else{
                System.out.print(num++ +" ");
            }
        }
        System.out.println();
    }
  }
}
