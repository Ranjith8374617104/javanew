class a{
    public void pl()
    {
        System.out.println("hello students");
    }
}
class b extends a{
    public void r()
    {
        System.out.println("Hello teachers");
    }
}
class c extends b{
    public void r1()
    {
        System.out.println("Hello professors");
    }
}
public class hierarchical{
    public static void main(String[] args){
        b h=new b();
        h.r();
        h.pl();
        c h1=new c();
        h1.pl();
        h1.r1();
    }
}