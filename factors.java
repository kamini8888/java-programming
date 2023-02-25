import java.util.Scanner;
class factors {
public static void main(String[] args) {
int  fcount=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int number = s.nextInt();
System.out.println("enter the n th number:");
int n=s.nextInt();
for (int i = 1; i <= number; ++i)
 {
if (number % i == 0)
{
fcount++;
if(fcount==n)
{
System.out.println("nth number is:"+i);
}
}
}
System.out.println("no of factor:"+fcount);
}
}
