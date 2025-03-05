class Constructor
{
    private int a,b;
    Constructor()
    {
        a=30;
        b=50;
    }
public void display()
 {
    System.out.println("a+b="+(a+b));
 }
}
class ConstructorMain
{
    public static void main(String[] args)
    {
Constructor c=new Constructor();
 c.display();
    }
}