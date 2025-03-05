
clss Parent1
{
void msg()
{
Systen.out.println("welcome");
}
}
class parent
{
public static viod main(String args[])
{
Parent1 p1=new Parent1();
p1.msg();
Parent1 p2=new Parent1()
{
void msg()
{
System.out.println("anonymous inner class);
}
};
p2.msg();
}
}