import java.util.Scanner;
import java.util.Arrays;
class mean
{
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in);
System.out.println("enter a number in an array"); 
int n=sc.nextInt();
int a[]=new int[n];
float sum=0;
System.out.println("enter "+n+" elements");
int m=0;
int y=0;

for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
}
if(n%2==0){
m=a[n/2 - 1];
y=a[n/2];
System.out.println("Median : "+m+ " and " +y);
}

else
{
m=( a[n/2]);
System.out.println("Median : "+m);   

}


for(int i=0;i<n;i++) 
{
sum=sum+a[i];
}
System.out.println("Mean :"+sum/n);

int maxValue = 0, maxCount = 0;
for (int i = 0; i < n; ++i) {
int count = 0;
for (int j = 0; j < n; ++j) {
if (a[j] == a[i])
++count;
}
if (count > maxCount) {
maxCount = count;
maxValue = a[i];
}
}
System.out.println("Mode : "+maxValue);

}
}
