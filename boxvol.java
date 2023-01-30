import java.util.Scanner;
class Box
{
double width;
double height;
double depth;
Box()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the width");
width = s.nextInt();
System.out.println("enter the height");
height =s.nextInt(); 
System.out.println("enter the depth");
depth = s.nextInt();
}
double volume()
{
return width * height * depth;
}
}
class boxvol
{
public static void main(String args[])
{
Box mybox1 = new Box();
double vol;
vol = mybox1.volume();
System.out.println("Volume of the first box is " + vol);
}
}
