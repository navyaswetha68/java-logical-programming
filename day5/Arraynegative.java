import java.util.Scanner;
class Arraynegative
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.print("enter the array size:");
n=sc.nextInt();
int a [] = new int[n];
System.out.print("enter the array elements");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the elements in array is:");
for(i=0;i<a.length;i++)
{
if(a[i]<0)
{
System.out.println("the negative no in an array is:"+a[i]);
}
else
{
System.out.println("there is no negative no in an array");
}
}
}
}