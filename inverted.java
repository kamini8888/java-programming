import java.util.Scanner;
public class inverted
{
    public static void main(String[] args)
    {
             
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
           char c = sc.next().charAt(0);

	for(int i=0;i<=n-1 ;i++)
               {
	        for(int j=0;j<=i;j++)
                
                       {
                               System.out.print(" ");
                       }
                       for(int k=0;k<=n-1-i;k++)
                
                       {
                               System.out.print(c+" ");
                       }
                      System.out.println();
               }                          
    }
}
