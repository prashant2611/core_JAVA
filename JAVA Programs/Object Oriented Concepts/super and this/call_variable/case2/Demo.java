class Base
{
  int x=50;
  int gun()
   {
    return x;
    }
}

class Derived extends Base
{
   int x=40;
}

class Derived1 extends Derived
{
  int x=10,y=20;
  void fun()
  {
   int x=30;
   System.out.println(this.x);
   System.out.println(this.y);
   System.out.println(x);
   System.out.println(super.x);
   System.out.println(gun());  // we can call methods in println functions those have return type other then void // we cannot call Base x using super and this 
   }
}

class Demo
{
  public static void main(String[] args)
  {
      Derived1 d1obj=new Derived1();
      d1obj.fun();
   }
}

//Output: 10 20 30 40 50
