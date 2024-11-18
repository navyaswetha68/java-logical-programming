class A
{
    int a,b,c;
    A()
    {
        a=10;
        b=20;
    }
    void add()
    {
        c=a+b;
        System.out.println("The addition value is :"+c);
    }
}
class B extends A
{
    int d;
    void mul()
    {
        d=a * b;
        System.out.println("The multiplication value is :"+d);
    }
}
class Single
{
    public static void main(String args[])
    {
        B mn=new B();
        mn.add();
        mn.mul();
    }
}