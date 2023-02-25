import java.util.Scanner;
class sqnum{
public static void main(String[] args) {
int rows,number=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows:");
rows=sc.nextInt();
for(int i= 1; i <= rows; i++) {
for(int j = 1; j <= i; j++) {
System.out.print(number*number + " ");
++number;
}
System.out.println();
}
}
}
