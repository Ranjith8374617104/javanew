class  methodoverloading
{
  public int a,b;
  public void set()
    {
        a=20;
        b=5;
    }
public void set(int x1)
  { 
    a=x1;
    b=30;
  }
  public void set(int x, int y)
  {
    a=x;
    b=y;
  }
  public void display()
  {
System.out.println(a+"+"+b+"="+(a+b));
  }
  public class pass1{
  public static void main(String[] args)
  {
    methodoverloading n=new methodoverloading();
    n.set();
    n.display();
    n.set(30,50);
    n.display();
    n.set(70);
    n.display();
  }
}
}