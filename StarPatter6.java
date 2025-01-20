public class StarPatter6 {
    public static void main(String args[])
    {
       
        for(int i = 1 ; i<=5 ; i++)
        {
          
            int k = 5; 
            for(int j = 1 ; j<=5;j++)
            {
                if(k>i)
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
               k--; 
            }
          
            System.out.println();
        }
    }
}
