class demo
{
int i=10;
public void show()
{
system.out.println("parent class 1="+1);
}
}
class demo1 extends demo
{
int i=20;
void show()
{
system.out.println("child class 1="+1);
}
}
class Result
{
public static void main(string args[])
{
demo1 ob:new demo();
ob.show();
}
}

