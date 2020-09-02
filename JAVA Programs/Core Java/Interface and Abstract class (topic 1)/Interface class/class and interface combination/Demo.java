interface Test
{
   void fun();
}

class Base
{
   static void gun()
   {
     System.out.println("Base class");
     }
   void sun()
   {
     System.out.println("Base of sun ");
     }
}

class Demo extends Base implements Test
{
  public void fun()
  {
   System.out.println(" Test interface ");
   }
  
  public static void main(String... args)
  {
    Test tobj=new Demo();
    Base bobj=new Base();
    tobj.fun();
    gun();   // only because of static class we can call directly. 
    bobj.sun();  // because sun() is not a static method so we have to first create object for it and then we can call it.
   }
}