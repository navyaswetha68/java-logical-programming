interface Super
{
    public void add(int a,int b);
    public void disp();
}
class Sub implements Super
{
    int a,b,c;
    public void add(int a,int  b)
    {
        this.a=a;
        this.b=b;
        c=a+b;
    }
    public void disp()
    {
        System.out.println("The value of a is:"+a);
        System.out.println("The value of b is:"+b);
        System.out.println("The addition of two value is:"+c);
    }
}
class Inter
{
    public static void main(String args[])
    {
        Sub mn= new Sub();
        mn.add(30,50);
        mn.disp();
    }
}