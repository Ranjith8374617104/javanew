import java.util.*;
interface printable{
}
class h implements printable{
    public void print()
    {
        System.out.println("hello students");
    }
}
public class maker
 {
    public static void main(String[] args){
        h f=new h();
        f.print();
    }
}