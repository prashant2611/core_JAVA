interface Base
{
 void sun();
}
interface Test
{
   int i=11;
   void fun();
}

interface Test1 extends Test,Base   // interface extends interface  // class extends class // class implements interface 
{
   int i=21;
   void gun();
}

class Demo implements Test1
{
   public void fun()
   {
    System.out.println("Test fun");
    }
   public void gun()
   {
    System.out.println("Test1 gun");
    
    }
   public void sun()
   {
    }
    
  public static void main(String... args)
  {
     Test1 tobj=new Demo();
     tobj.fun();
     tobj.gun();
     System.out.println(i);    // it will give output i=21 , suppose we have to access i=11 then we dont have to extends interface to interface
   }
}