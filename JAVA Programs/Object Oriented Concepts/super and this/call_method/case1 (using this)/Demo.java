class Base
{
  void fun()
   {
      System.out.println("Base fun");
    }
  void sun()
   {
     System.out.println("sun Base");
    }

 }

class Derived extends Base
 {
   void gun()
   {
    this.fun();    // call fun Derived because "this" gives first preference to their class.
    System.out.println("gun Derived");
    }
   void fun()
    {
       this.sun();  // class sun Base because when there is no function available like this in their class then it search for it to in its parent class.
       System.out.println("fun Derived");
     }
  }

class Demo
{
  public static void main(String []args)
  {
    Derived dobj=new Derived();
    dobj.gun();
  }
}