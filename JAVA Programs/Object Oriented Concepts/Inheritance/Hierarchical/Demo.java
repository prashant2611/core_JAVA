class Base
{
 public void sun()
  {
    System.out.println("Sun of Base");
   }
}

class Derived1 extends Base
{
  public void gun()
   {
    System.out.println("gun of Derived1");
    }
}

class Derived2 extends Base
{
 public void gun()
 {
  System.out.println("gun of Derived2");
  }
}

class Demo
{
 public static void main(String[] args)
 {
   Derived1 d1obj=new Derived1();
   Derived2 d2obj=new Derived2();
 
   d1obj.gun();
   d1obj.sun();
   d2obj.gun();
   d2obj.sun(); 
  
    
  }
} 