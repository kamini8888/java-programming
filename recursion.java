import java.util.Scanner;
class recursion{  
static int factorial(int n){    
if (n == 0)    
return 1;    
else   
return(n * factorial(n-1));    
}    
public static void main(String args[]){  
int i,fact=1; 
Scanner s=new Scanner(System.in);
System.out.println("enter the number:"); 
int number=s.nextInt();;   
fact = factorial(number);   
System.out.println("Factorial of "+number+" is: "+fact);    
}  
}  
