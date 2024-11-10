import java.util.Scanner;
class Number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num;
System.out.println("enter a number:");
num=s.nextInt();
if(num%2==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the given number is odd");
}
}
}