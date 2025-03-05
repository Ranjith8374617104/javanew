class CO
{
    private int j,t;
    CO()
    {
        j=10;
        t=5;
    }
    CO(int x)
    {
        j=x;
        t=30;
    }
    CO (int x, int y)
    {
        j=x;
        t=y;
    }
    public void display jt()
    {
    System.out.println("j="+j+\t"t="+t);
    }
}
 public class MCO
{
    pulic static void main(String[] args)
    {
    CO c1=new (OC);
       c1.displayjt();
    CO c2=new CO(50);
       c2.displayjt();
    CO c3=new CO(100,5);
       c3.displayjt();
    }
}
