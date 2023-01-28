import java.io.Writer;
import java.io.FileWriter;
import java.util.Scanner;
public class write{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter your string:");
String data=s.nextLine();
try{
FileWriter output=new FileWriter("example.txt");
output.write(data);
output.close();
}
catch(java.lang.Exception e){
e.getStackTrace();
}
}
}
