import java.util.Scanner;
class Numbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1,n,sum=0;
System.out.print("enter the n value");
n=sc.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.print("sum of natural numbers:"+sum);
}
}

