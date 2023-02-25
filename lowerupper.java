import java.util.Scanner;
class lowerupper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String a=sc.nextLine();
System.out.println("Total=:"+a);
String s1=a;
 s1=a.toUpperCase();
System.out.println("uppercase:"+s1);
String s2=a;
 s2=a.toLowerCase();
System.out.println("lowercase:"+s2);
}
}
