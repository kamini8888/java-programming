import java.util.Scanner;
class power{
public static boolean isPowerOfThree(int n)
{
if(n<3)
return false;
while(n%3==0)
{
n/=3;
}
return n==1;
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n = s.nextInt();
if (isPowerOfThree(n))
System.out.println(n + " is a Power of Three.");
else
System.out.println(n + " is not a Power of Three.");
}
}
