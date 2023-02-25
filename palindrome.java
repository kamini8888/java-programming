import java.util.Scanner;
class palindrome{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your string:");
String s=sc.nextInt();
int len=s.length();
StringBuffer num=new StringBuffer();
for(int i=len-1;i>=0;i++){
num=num.append(s.charAt(i));
}
if(num.equalsIgnoreCase(num.toString()){
System.out,println(num+"is a palindrome");
}
else{
System.out.println(num+"is not a palindrome");
}
}
}
