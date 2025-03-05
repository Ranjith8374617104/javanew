class M
{
class S
{
void inner()
{
System.out.println("bad people");
}
}
void outer()
{
System.out.println("in india");
}
public static void main (string args[])
{
M obj=new M();
M.S ob=new M().new S();
obj.outer();
ob.inner();
}
}