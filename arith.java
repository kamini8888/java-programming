import java.util.Scanner;
class arith{
public static void main(String[] args){
try{
Scanner s=new Scanner(System.in);
System.out.println("enter two numbers:");
int a=s.nextInt();
int b=s.nextInt();
int c=a+b;
System.out.println("addition="+c);
int d=a-b;
System.out.println("subtraction="+d);
int e=a*b;
System.out.println("multiplication="+e);
int f =a/b;
System.out.println("division ="+f);
int g=a%b;
System.out.println("modulus="+g);
}
catch(ArithmeticException e){
System.out.println("Arithmetic exception for division by zero");
}

}
}
