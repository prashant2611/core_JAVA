class Base
{
  /* private void fun()
   {
     System.out.println("Base of fun ");
    }*/
   static void sun()
   {
    System.out.println("Base of sun");
    }
   void gun()
   {
    System.out.println("Base of gun");
    }
}

class Derived extends Base
{
    void fun()
   {
     System.out.println("Derived of fun ");
    }
  
   static void sun()
   {
    System.out.println("Derived of sun");
    }
   void gun()
   {
    System.out.println("Derived of gun");
    }
  }

class Demo
{
 public static void main(String []args)
 {
  Base bobj=new Derived();
  //bobj.fun();  //gives error because private method cannot override
  bobj.sun();    //static method also not override but if declare both method static and static scope is class scope so output will be of Base class. that method dosent goes to Derived one.
  bobj.gun();
 }
}