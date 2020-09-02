class Base
{
  public void sun()
  {
    System.out.println("sun of Base");
   }

}

class Derived extends Base
{
  public void gun()
   {
    System.out.println("gun of Derived");
    }
}

class Derived1 extends Derived
{
  public void fun()
   {
       System.out.println("Fun of Derived1");   
     }
  

}

class Demo
{
 public static void main(String[] args)
 {
  Derived1 d1obj=new Derived1();
  d1obj.fun();
  d1obj.gun();
  d1obj.sun();
  System.out.println("Main");    

  }
}