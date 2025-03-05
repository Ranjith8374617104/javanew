
class Parent1
{
void msg()
{
System.out.println("heartly welcome to");
}
}
class Parent
{
public static void main(String args[])
{
Parent1 p1=new Parent1();
p1.msg();
Parent1 p2=new Parent1()
{
void msg()
{
System.out.println("anonymous inner class");
}
};
p2.msg();
}
}