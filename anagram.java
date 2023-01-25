import java.util.Arrays;
import java.util.Scanner;

class anagram{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter two string");
String str1 = s.nextLine();
String str2 = s.nextLine();
str1 = str1.toLowerCase();
str2 = str2.toLowerCase();
if(str1.length() == str2.length()) {
char[] charArray1 = str1.toCharArray();
char[] charArray2 = str2.toCharArray();
Arrays.sort(charArray1);
Arrays.sort(charArray2);
boolean result = Arrays.equals(charArray1, charArray2);
if(result) {
System.out.println(str1 + " and " + str2 + " are anagram.");
}
else {
System.out.println(str1 + " and " + str2 + " are not anagram.");
}
}
else {
System.out.println(str1 + " and " + str2 + " are not anagram.");
}
}
}
