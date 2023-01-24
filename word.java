import java.util.Scanner;
class word{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string:");
String s=sc.nextLine();
String[] s2=s.split(" ");
String lastword=s2[s2.length-1];
System.out.println("last word:"+lastword);
}
}
