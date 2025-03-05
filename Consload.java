import java.util.*;
public class Consload{
    String name;
    Consload();
    {
        name="manisha";
    }
    Consload(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String[] args){
        Consload o=new Consload();
        o.display();
        Consload o1=new Consload("manikanta");
        o1.display();
    }
}