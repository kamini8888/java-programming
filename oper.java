import java.util.Scanner;
class oper{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println("length of the string is");
System.out.println(s.length());
System.out.println("replacing letter a with z");
System.out.println(s.replaceAll("[a]","z"));
System.out.println("the string in upper case");
System.out.println(s.toUpperCase());
}
}
