import java.util.*;
interface math{
    public int operation(int a,int b);
}
public class operands{
    public static void main(String[] args)
    {
        math add=(a,b)->a+b; 
        math sub=(a,b)->a-b; 
       System.out.println(add.operation(4,5));
       System.out.println(sub.operation(19,39));
    }
}