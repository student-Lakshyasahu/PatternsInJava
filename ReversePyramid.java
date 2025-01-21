import java.util.Scanner;

public class ReversePyramid {
    public static void pyramidPatter(int row)
    {
        int num = 1;
    for(int i = 1; i<=row ; i++)
    {
        for(int j = 1 ; j<=i ; j++)
        {
            System.out.print(" ");
        }
        for(int k = (row*2)-num; k>=1; k--)
        {
            System.out.print("*");
        }
        num+=2;
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row you want to print ");
        int row = sc.nextInt();
        pyramidPatter(row);
    }
}
