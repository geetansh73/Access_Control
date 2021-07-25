class testaccess
{
private int pri=10;
public int pub=5;
System.out.print(pub);
private void privateMethod()
{
System.out.print("Im private to this class only");
}
public void publicMethod()
{
System.out.print("can reach me from outside");
}
public void accessprivate()
{
System.out.print("private variable inside public method="+pri);
privateMethod();
}
}
public class accesscontrol
{
public static void main(String geetu[])
{
testaccess ob=new testaccess();
ob.pub=100;
System.out.print(ob.pub);
ob.publicMethod();
ob.accessprivate();
}
}
