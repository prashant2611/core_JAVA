class Base
{
  void fun()
  {
     System.out.println("Base fun");
    }
}

class Derived extends Base
{
  void gun()
  {
    System.out.println("Derived gun");
   }
}

class Demo2
{
 public static void main(String... args)
 {
   Base bobj=new Base();
   Derived dobj=new Derived();
   dobj.fun();
   dobj.gun();
   System.out.println("Main");
  }
}