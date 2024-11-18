//Multilevel inheritance
import java.util.*;
class Student
{
        Scanner mn=new Scanner(System.in);
    int sno,m1,m2,m3;
    String sname;
    void read()
    {
        System.out.println("Enter the student roll number :");
        sno=mn.nextInt();
        System.out.println("Enter the student name :");
        sname=mn.next();
        System.out.println("Enter the student Maths Marks :");
        m1=mn.nextInt();
        System.out.println("Enter the student Physics Marks :");
        m2=mn.nextInt();
        System.out.println("Enter the student Computer Science Marks :");
        m3=mn.nextInt();
    }
}
class Student1 extends Student
{
    int tot;
    float avg;
    void total()
    {
        tot=m1+m2+m3;
        avg=tot/3;
    }
}
class Student2 extends Student1
{
    void report()
    {
        System.out.println("The Student roll number is :"+sno);
        System.out.println("The Student name is :"+sname);
        System.out.println("The Student total marks is :"+tot);
        System.out.println("The Student total average marks is :"+avg);
    }
}
class Multilevel
{
    public static void main(String args[])
    {
        Student2 m=new Student2();
        m.read();
        m.total();
        m.report();
    }
}