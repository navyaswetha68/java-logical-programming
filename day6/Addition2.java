class Addition
{
    int a,b,c;
    Addition(int x, int y)
    {
    a=x;
    b=y;
    c=a+b;
    System.out.println("The addition number is :"+c);
    }
}
class Addition2
{
    public static void main(String args[])
    {
        int m=12,n=33;
        Addition mn=new Addition(m,n);
        //Addition mn=new Addition(12,34);
    }
}