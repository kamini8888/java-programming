import java.util.Scanner;
class pal{
public static void main(String[] args){
int op,n;
Scanner sc=new Scanner(System.in);
System.out.println("case 1 or case2:");
String str=sc.nextLine();
op=str.charAt(0);

switch(op)
{
case '1':
System.out.println("enter your string:");
String s=sc.nextLine();
int len=s.length();
StringBuffer num=new StringBuffer();
for(int i=len-1;i>=0;i--){
num=num.append(s.charAt(i));
}
if(s.equalsIgnoreCase(num.toString())){
System.out.println(num+"is a palindrome");
}
else{
System.out.println(num+"is not a palindrome");
}
break;
case '2':
System.out.println("Enter any number: ");
int r, sum=0,temp;

n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
n=n/10;
sum=sum*10+r;
}
if(temp==sum)
{
System.out.println("Number is Palindrome");
}
else
{
System.out.println("not Palindrome");
}
break;

}
}
}
