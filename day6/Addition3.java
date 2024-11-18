class Addition
{
    int a,b,c;
    Addition()
    {
        System.out.println("It is non parameterized constructor");
    }
    Addition(int n)
    {
        System.out.println("The value of n is :"+n);
    }
    Addition(int x,int y)
    {
        a=x;
        b=y;
        c=x+y;
        System.out.println("The addition is :"+c);
    }
}
class Addition3
{
    public static void main(String args[])
    {
        Addition m=new Addition();
        Addition n=new Addition(200);
        Addition mn=new Addition(35,55);
    }
}