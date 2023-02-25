import java.util.Scanner;
class multiplication
{
public static void main(String[] args)
{
int i,j;
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of m upto n");
int m=sc.nextInt();
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(i+"*"+m+"="+(m*i));
}
if(n<0)
{
System.out.println("invalid");
}
}
catch(Exception e)
{
System.out.println("invalid input");
}
}
}
