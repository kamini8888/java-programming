import java.util.Scanner;
class sqr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter decimal number:");
float num=sc.nextFloat();
float sqr,cube;
sqr=num*num;
cube=num*num*num;
System.out.println("square:"+sqr);
System.out.println("cube:"+cube);
}
}
