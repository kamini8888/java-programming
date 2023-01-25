import java.util.Scanner;
class vote{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a age");
int a =sc.nextInt();
if(a>=18){
System.out.println("you are eligible to vote");
}
else{
int k=18-a;
System.out.println("you are allowed to vote after "+k+" years");
}
}
}
