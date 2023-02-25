import java.util.Scanner;
class romannum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string:");
char I=1,X=10,L=50,C=100,D=500,M=1000;
int i;
String str=sc.nextLine();
for(i=1;i<=str.length();i++)
{
if(i==I||i==X||i==L||i==C||i==D||i==M)
{
  i=i+i+i;
}
}
System.out.print("output:"+i);
}
}
