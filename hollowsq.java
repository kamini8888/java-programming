import java.util.Scanner;
class hollowsq
{
public static void main(String[] arags)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter sides:");
int side=sc.nextInt();
System.out.println("Printing hollowsqr:");
for(int i=1;i<side;i++)
{
for(int j=1;j<side;j++)
{
if(i==0||i==side-1||j==0||j==side-1)
{
System.out.println("*");
}
}
System.out.println();
}
}
}
