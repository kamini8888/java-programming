import java.util.*;
class num
{
	public static void main(String[] args) 
	{
	    int n,or,re,rev=0;
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter: ");
		if(!sc.hasNextInt())
		{
		    System.out.println("Enter only Integers");
		    return;
		}
		n=sc.nextInt();
		or=n;
		while(n!=0)
		{
		    re=n%10;
		    rev=rev*10+re;
		    n=n/10;
		}
		System.out.print("Reverse: "+rev);
	}
}
