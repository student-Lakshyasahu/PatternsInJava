
import java.util.Scanner;

public class Starpattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print StarPattern");
        int num = sc.nextInt();
        for(int i = num ; i>=1 ; i--)
        {
            for(int j = num ; j>=i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
