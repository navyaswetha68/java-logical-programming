import java.util.Scanner;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,t,j;
System.out.print("enter the array size:");
n=sc.nextInt();
int a[] = new int[n];
System.out.print("enter the array elements");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the elements in array before sorting:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
for(i=0;i<2;i++)
{
for(j=0;j<n-1-i;j++)
{
if(a[i]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
System.out.println("the elements in array aftersorting:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
}
}