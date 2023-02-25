import java.util.Scanner;
class multiple
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("input:");
int m=sc.nextInt();
System.out.println("range:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println(m+"x"+i+"="+m*i);
}
}
}
