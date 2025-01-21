
import java.util.Scanner;

public class DiamondBorder {

    public static void diamondBorder(int row) {
        for (int i = 1; i <= row; i++) 
        {
            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 2; k < (i * 2); k++) {

                System.out.print(" ");

            }
            for (int l = row; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row ; i>=1; i--)
        {
            for(int j = row; j>=i;j--)
            {
                System.out.print("*");
            }
            for(int k=2 ;k<(i*2); k++)
            {
                System.out.print(" ");
            }
            for(int l = row; l>=i;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row you want to print");
        int row = sc.nextInt();
        diamondBorder(row);
    }
}
