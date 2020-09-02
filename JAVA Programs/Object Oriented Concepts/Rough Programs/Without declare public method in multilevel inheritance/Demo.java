class Base
{
  protected void fun()
   {
     System.out.println("Fun of base");
    }
}

class Derived extends Base
{
  void gun()
  {
    System.out.println("gun of Derived");
   }
}

class Derived1 extends Derived
{
  void sun()
  {
   System.out.println("sun of Derived1");
  }
}

class Demo
{
  public static void main(String[] args)
  {
    Derived1 dobj=new Derived1();
     dobj.sun();
     dobj.gun();
     dobj.fun();
   }

}