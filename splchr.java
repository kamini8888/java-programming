import java.io.*;
import java.util.Scanner;

class splchr{
public static void main(String[] args){
int count = 0;
Scanner a=new Scanner(System.in);
System.out.println("enter your string");
String s=a.nextLine();
System.out.println("Special characters are");
System.out.println(s.replaceAll("[a-zA-Z1-9]",""));
for (int i = 0; i < s.length(); i++){
if (!Character.isDigit(s.charAt(i))&& !Character.isLetter(s.charAt(i))&& !Character.isWhitespace(s.charAt(i))){
count++;
}
}
if (count == 0){
System.out.println("No Special Characters found.");}
else{
System.out.println("String has "+ count+" Special Characters " );}
}
}
