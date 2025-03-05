class Demo
{
    void koushi()
        {
            System.out.println("koushi is running.");
        }
    void koushik()
        {
            System.out.println("koushik is dancing");
        } 
}
class Demo1 extends Demo
{
    void chintu()
    {
        System.out.println("chintu from mpl");
    }
    void chintuu()
    {
        System.out.println("chintuu roaming in RR street");
    }
}
public class Main
{
    public static void main(String[]args)
    {
        Demo1 ob=new Demo1();
             ob.koushi();
             ob.koushik();
             ob.chintu();
             ob.chintuu();
            
    }
}