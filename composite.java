
import java.util.Scanner;
class composite{
public static void main(String[] args){
int i,j,n,c,count=0;
Scanner sc=new Scanner(System.in);
System.out.print("No. of integers: ");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements: ");
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.print("\nComposite: ");
for(i=0;i<n;i++){
c=0;
for(j=1;j<=a[i];j++){
if(a[i]%j==0){
c++;
}
}
if(c>2){
count++;
System.out.print(" "+a[i]);
}
}
System.out.print("\nNo. of Composite= "+count);
}
}
