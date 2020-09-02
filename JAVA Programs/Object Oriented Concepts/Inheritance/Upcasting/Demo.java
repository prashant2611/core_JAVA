class Base
{
  public void fun()
  {
    System.out.println("fun of Base");
   }
  public void sun()
    {
    System.out.println("gun of Base");
    }
}

class Derived extends Base
{
    public void fun()
  {
    System.out.println("fun of Derived");
   }
  public void gun()
    {
    System.out.println("gun of Derived");
    }
}

class Demo
{
 public static void main(String []args)
 {
   Base bobj=new Derived();
   bobj.fun();
   bobj.sun();
  // bobj.gun();  //gives error
  }
}