import java.util.Scanner;
class Emp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int empno;
String ename;
float esal;
   System.out.print("Enter employee no:" );
        empno=sc.nextInt();

        System.out.print("Enter employee name: ");
        ename=sc.next();

        System.out.print("Enter employee salary: ");
        esal=sc.nextFloat();
System.out.println("employee no: " + empno);
System.out.println("employee Name: " + ename);
System.out.println("employee salary:" + esal);
}

}
      

