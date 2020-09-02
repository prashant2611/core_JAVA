class Base
{
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
     super.gun();
    }
}

class Derived1 extends Derived
{
  void fun()
   {
    System.out.println("fun of Derived1");
    }
  void gun()
   {
     fun();
     this.fun();
     super.fun();
 
   }

}

class Demo
{
 public static void main(String []args)
  {
     Derived1 d1obj=new Derived1();
     d1obj.gun();
   }
  }