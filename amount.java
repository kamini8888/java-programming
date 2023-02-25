import java.util.Scanner;
class amount{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the income");
int in=s.nextInt();
int tax;
if(in<=250000){
System.out.println("no tax");
}
else if(in>250000 && in<500001){
int temp=in-250000;
System.out.println("taxable amt is"+temp);
tax=temp*5/100;
System.out.println("tax is :"+tax);
}
else if(in>500000 && in <700001){
int temp=in-250000;
System.out.println("taxable amt is"+temp);
tax=temp*10/100;
System.out.println("tax is :"+tax);
}
else if(in>700000 && in<1000001){
int temp=in-250000;
System.out.println("taxable amt is"+temp);
tax=temp*15/100;
System.out.println("tax is :"+tax);
}
else if(in>1000000 && in<1500001){
int temp=in-250000;
System.out.println("taxable amt is"+temp);
tax=temp*20/100;
System.out.println("tax is :"+tax);
}
else{
int temp=in-250000;
System.out.println("taxable amt is"+temp);
tax=temp*30/100;
System.out.println("tax is :"+tax);
}
}
}
