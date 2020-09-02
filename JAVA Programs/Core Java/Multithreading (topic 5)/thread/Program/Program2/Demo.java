class A
{
 void fun(String msg)
 {
  System.out.println("Fun"+msg);
  try
  {
   Thread.sleep(1000);
   }
  catch(Exception e)
  {
   System.out.println("Thread interupted");
   }
  System.out.println(msg);
  }
}

class Test extends Thread
{
  String msg;
  A aobj;
  Test(String s,A obj)
  {
    msg=s;
    aobj=obj;
   }

  public void run()
   {
        synchronized(aobj)                      // aobj is for to hold that object till execution of that process not completed.
        {
        aobj.fun(msg);
        }
    }
}

class Demo
{
 public static void main(String... args)
 {
   A obj1=new A();
   Test tobj1=new Test("Hello",obj1);
   Test tobj2=new Test("World",obj1);

   tobj1.start();
   tobj2.start();
  }
}