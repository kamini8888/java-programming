import java.util.Scanner;
class stp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int step1=0;
while(num>0){
if(num%2==0){
num=num/2;
}
else{
num=num-1;
}
step1++;
}
System.out.print(step1);
}
}
