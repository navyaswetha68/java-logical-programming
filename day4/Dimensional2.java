import java.util.Scanner;
class Dimensional2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,r,c;
r=sc.nextInt();
c=sc.nextInt();

int a[][] = new int[r][c];
System.out.print("enter the array elements");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("elements in the array");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println(a[i][j]);
}
}
System.out.println();
}
}
