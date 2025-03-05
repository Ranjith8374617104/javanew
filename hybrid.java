import java.util.*;
class gp{
public void r()
{
    System.out.println("hello i'm grand parent");
}
}
class p1 extends gp{
    public void r1()
    {
        System.out.println("hello i'm parent1");
    }
}
interface p2
{
    void r2();
}
class d extends p1 implements p2{
    public void r2()
    {
        System.out.println("i'm parent 2");
    }
    public void r3()
    {
        System.out.println("i'm child class");
    }
}
public class hybrid{
    public static void main(String[] args){
        d h=new d();
        h.r();
        h.r1();
        h.r2();
        h.r3();
    }
}