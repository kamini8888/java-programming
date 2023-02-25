import java.io.*;
import java.util.Scanner;
class fizzbuzz{
public static void main(String[] args){
String s = "";
int a = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for (int i = 1; i <= n; i++) {
a++;


if (a%3==0 && a%5==0){
s="fizzbuzz";
System.out.println(s);
}
else if (a %3==0) {
s = "fizz";
System.out.println(s);

}
else if (a %5==0) {
s = "buzz";
System.out.println(s);

}
else{
System.out.println(i);
}
}
}
}
