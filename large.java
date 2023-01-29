import java.util.*;
class large{
public static void main(String[] args) 
{
int x,i,j,n,desc,asce,max;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no. of elements: ");
x=sc.nextInt();
int a[]=new int[x];
System.out.println("Enter elements: ");
for(i=0;i<x;i++){
a[i]=sc.nextInt();
}
System.out.print("M: ");
n=sc.nextInt();
if(n>x ||  n==0 ){
System.out.println("Invalid N");
return;
}
for(i=0;i<x;i++){
for(j=i+1;j<x;++j){
if(a[i]<a[j]){
desc=a[i];
a[i]=a[j];
a[j]=desc;
}
}
}
max=a[n-1];
System.out.println(n+" Maximum no. is: "+max);
}
}
