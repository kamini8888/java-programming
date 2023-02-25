import java.util.Scanner;
class sq
{
public static void main(String[] args) {
int i,j;
int x;
Scanner s=new Scanner(System.in);
System.out.println("Enter the values of m and n lower and uppper ranges");
int m=s.nextInt();
int n=s.nextInt();
x=(n-m)+1;
int k=m;
int arr[][]=new int[x][2];
System.out.println("The output is:");
System.out.print("[");

for(i=0;i<x;i++)
{
arr[i][0]=k;
arr[i][1]=(k*k);
k=k+1;
System.out.print( "(" +arr[i][0]+ "," +arr[i][1]+ ")," );
}
System.out.print("]");
}
}
