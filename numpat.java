import java.util.Scanner;
class numpat {
public static void main(String[] args)
{
int i,j,n,space;
Scanner in = new Scanner(System.in);
System.out.println("Input number of n : ");
n=in.nextInt();
for(i=1;i<=n;i++) {
for(space=n;space>i;space--){
System.out.print(" ");
}
for(j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println(" ");
}
}
} 
			
