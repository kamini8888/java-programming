import java.util.Scanner;
class shape{
public static void main(String[] args){
int i,j,n,space;
Scanner s=new Scanner(System.in);
System.out.println("input he number of n:");
n=s.nextInt();
for(i=1;i<=n;i++){
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
