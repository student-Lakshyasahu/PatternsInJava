import java.util.*;
public class HollowRhombus {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many row you want to print");
        int row = sc.nextInt();
        for(int i = row; i>=1; i-- )
        {
            for(int j =1; j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=row ; k++)
            {
                if(i==row||i==1||k==1||k==row)
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
}
