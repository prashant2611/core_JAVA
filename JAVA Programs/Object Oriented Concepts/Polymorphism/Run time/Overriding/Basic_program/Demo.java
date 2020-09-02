class Base
{
  void fun()
   {
     System.out.println("fun of Base");
   }
  
  void gun()
   {
    System.out.println("gun of Base");
    }
}

class Derived extends Base
{
  void fun()
  {
   System.out.println("fun of Derived");
   }

 void sun()
  {
  System.out.println("sun of Derived");
   }
}

class Demo
{
 public static void main(String... args)
 {
   Base bobj=new Derived();
   bobj.fun();
   bobj.gun();
  // bobj.sun();  // error: we cant call unoverride methods in upcasting.   
  }
}

/* Output:
fun of Derived
gun of Base
*/