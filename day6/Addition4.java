class Addition
{
    int a=33;
    void mem()
    {
        int a=66;
        System.out.println("Instance of a method is :"+this.a);
        System.out.println("Local variables is:"+a);
    }
}
class Addition4
{
    public static void main(String args[])
    {
        Addition mn=new Addition();
        mn.mem();
    }
}