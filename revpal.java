import java.util.Scanner;

public class revpal
{
static int reversenumber(int number){
int reverse = 0;
int rem = 0;
while (number != 0)
{
rem = number % 10;
reverse = (reverse*10) + rem;
number = number/10;
}
return reverse;
}
static boolean checkpalindrome(int number)
{
int reverse = reversenumber(number);
if(reverse == number)
{
return true;
}
else
{
return false;
}
}	
static void reverseadd(int number)
{
if(checkpalindrome(number)){
System.out.println("Given Number is already a palindrome");
}
else{
while (!checkpalindrome(number))
{
int reverse = reversenumber(number);		
int sum = number + reverse;				
System.out.println(number+" + "+reverse+" = "+sum);
number = sum;
}
}
}	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
int n = sc.nextInt();
reverseadd(n);
}
}
