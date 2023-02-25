import java.util.Scanner;
class binary{  
public static void main(String args[]){  
Scanner s=new Scanner(System.in);
System.out.println("enter a binary number:");
String binaryString=s.nextLine();  
int decimal=Integer.parseInt(binaryString,2);  
System.out.println("Decimal Value is : " + decimal);  
System.out.print("Octal value is ");
System.out.println(Integer.toOctalString(decimal));
}
}  
