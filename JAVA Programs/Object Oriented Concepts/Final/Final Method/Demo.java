class Base
{
   final void fun()
   {
     System.out.println("Fun of base");
    }  
}

class Derived extends Base
{
/* void fun()     //It gives error because we cannot override final method.
 {
    System.out.println("Fun of derived");
  }
*/
}


class Demo
{
 public static void main(String []args)
 {
 Derived dobj=new Derived();
 dobj.fun();
}
}