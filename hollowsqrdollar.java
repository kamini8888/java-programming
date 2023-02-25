import java.util.Scanner;
class hollowsqrdollar
{
  private static Scanner sc;	
   public static void main(String[] args) 
{
    sc = new Scanner(System.in);		
    System.out.print("Enter Side = ");
    int n=sc.nextInt();
    System.out.print("Enter symbol to be printed = ");
    String sym=sc.next();	
    for (int i=0;i<n;i++ ) 
    {
     for (int j=0;j<n;j++) 
      {
        if (i==0 || i==n-1 || j==0 || j==n-1) 
         {
	     System.out.print(sym);
         }
        else 
         {
            System.out.print(" ");
         }
	}
	 System.out.println();
	}
      }
}
