abstract class Base
{
  int i=10;  // not final
  Base()                             // Constructor allowed
   {
    System.out.println("Base Constructor ");
    }  

  abstract void fun();
  void gun()
  {
   System.out.println("gun of Base ");
   }
}

class Demo extends Base
{
   void fun()
   {
     System.out.println("fun of Base");
    }
     static public void main(String... args)
     {
       Base bobj=new Demo();
       bobj.fun(); 
       bobj.gun();
       bobj.i++;
       System.out.println(bobj.i);    
      }
    
}