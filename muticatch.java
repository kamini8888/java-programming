import java.util.Scanner;
class multicatch{
public static void main(String[] args){
try{
int arr[]=new int[7];
arr[10]=10/5;
System.out.println("first print your statement in try block");
}
catch(ArithmeticException e){
System.out.println("Arithmetic exception");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("array index out of bound exception");
}

System.out.println("out of try catch block");
}
}
