import java.io.Reader;
import java.io.FileReader;
public class read{
public static void main(String[] args){
char [] array=new char[100];
try{
Reader input=new FileReader("C:\\Users\\Documents\\program\\example.txt");
input.read(array);
System.out.println("data in the file ");
System.out.println(array);
input.close();
}
catch(java.lang.Exception e){
e.getStackTrace();
}
}
}
