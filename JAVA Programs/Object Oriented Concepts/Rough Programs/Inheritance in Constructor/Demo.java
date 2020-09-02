class Base
{
 Base()
  {
    System.out.println("Base Constructor");
   }
}

class Derived extends Base
{
 Derived()
 {
   System.out.println("Derived Constructor");
  }
}

class Derived1 extends Derived
{
 Derived1()
 {
   System.out.println("Derived1 Constructor");
  }
}

class Demo
{
 public static void main(String[] args)
 {
   Derived1 d1obj=new Derived1();
  }
}