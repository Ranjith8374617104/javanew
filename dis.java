import java.util.*;
public class dis{
    void display()
    {
        System.out.println("Hello students");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String[] args){
        dis o=new dis();
        o.dis1();
    }
}