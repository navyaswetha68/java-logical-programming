import java.util.*;
class Base
{
    Scanner mn=new Scanner(System.in);
    int n;
    void read()
    {
        System.out.println("Enter n value");
        n=mn.nextInt();
    }
}
class Sub extends Base
{
    void fact()
    {
        int f=1,i;
        for(i=1;i<=n;i++)
        f=f*i;
        System.out.println("The factorial is :"+f);
    }
}
class Child extends Base
{
    void sum()
    {
        int s=0,i;
        for(i=1;i<=n;i++)
        s=s+i;
        System.out.println("The sum of natural numbers is :"+s);
    }
}
class Hierarichal
{
    public static void main(String args[])
    {
        Sub m=new Sub();
        Child n=new Child();
        m.read();
        m.fact();
        n.read();
        n.sum();
    }
}