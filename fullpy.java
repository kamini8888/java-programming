import java.util.Scanner;
public class fullpy{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows");
int n=sc.nextInt();
for (int i=0; i<n; i++)
{
for (int j=n-i; j>1; j--)
{

System.out.print(" ");
}
for (int j=0; j<=i; j++ ){
System.out.print("* ");
}
System.out.println();
}
}
}
