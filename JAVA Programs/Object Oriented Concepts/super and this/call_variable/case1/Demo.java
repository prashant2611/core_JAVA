class Base
{
  int x=30;
}

class Derived extends Base
{
  int x=10;
  int y=60;
  
  void fun()
   {
     int x=40;
     System.out.println(x);
     System.out.println(this.x);
     System.out.println(y);
     System.out.println(super.x);
    }
}

class Demo
{
   public static void main(String... args)
   {
     Derived dobj=new Derived();
     dobj.fun();
    }
}

// Output: 40 10 60 30