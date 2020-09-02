class Base
{
 public void fun()
  {
   System.out.println("Base of fun ");
   }
 public void gun()
  {
   System.out.println("Base of gun");
   }
}

class Derived extends Base
{
  public void fun()
   {
      System.out.println("Derived of fun ");
    }
  public void sun()
   {
      System.out.println("Derived of sun");
   }
}

class Demo
{
 public static void main(String[] args)
  {
    Derived dobj=new Derived();
    dobj.sun();
    dobj.fun();
    dobj.gun();
    System.out.println("Main");
  }
}