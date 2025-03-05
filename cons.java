class Parameterconstrutor
{
    public int a,b;
    Parameterconstrutor(int x,int y);
    {
        a=x;
        b=y;
    }
    public void print values()
    {
 System.out.println("a="+a\+"b="+b);
    }
}
 public class cons
{
    public static void main(String[] args)
    {
        Parameterconstrutor p=new Parameterconstrutor(2,3);
        p.print values();
    }
}
        