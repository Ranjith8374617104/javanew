import java.util.*;
public class Main{
    String name;
    Main(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String[] args){
        Main o=new Main("manisha");
        o.agt();
    }
}
class teacher{
    public void teach(Main s){
        s.dis1();
    }
}