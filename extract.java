import java.util.Scanner;
class extract{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
String s=sc.nextLine();
System.out.println("getting the vowels in string:");
System.out.println(s.replaceAll("[bcdfghjklmnpqrstvwxyz]",""));
System.out.println("getting the consonants in string");
System.out.println(s.replaceAll("[aeiou]",""));
}
}
