import java.util.Scanner;
class rectangle{
	
	public static void main(String[] args) 
	{
		int rows, columns, i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter Number of Rows : ");
		rows = sc.nextInt();	
		
		System.out.print(" Please Enter Number of Columns : ");
		columns = sc.nextInt();
           System.out.print("Enter Symbol : ");
	
           char c = sc.next().charAt(0);		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print(c+" "); 
			}
			System.out.print("\n"); 
		}	
	}
}
