import java.util.Scanner;
class caltax{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the income");
int in=s.nextInt();
int temp=in-250000;
int tax;
if(in<=250000){
System.out.println("no tax");
}
else if(temp>250000 && temp<500001){
System.out.println("taxable amt is"+temp);
tax=temp*10/100;
System.out.println("tax is :"+tax);
}
else if(temp>500000 && temp<1000001){
System.out.println("taxable amt is"+temp);
tax=temp*20/100;
System.out.println("tax is :"+tax);
}
else{
System.out.println("taxable amt is"+temp);
tax=temp*30/100;
System.out.println("tax is :"+tax);
}
}
}
