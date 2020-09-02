class Test implements Runnable
{
  public void run()
  {
   for(int i=0;i<10;i++)
    {
    System.out.println("Child thread");
   }
  }
}
class Demo
{
 public static void main(String... args)
 {
  Test tobj=new Test();
  Thread t=new Thread(tobj);
  t.start();

   for(int i=0;i<10;i++)
    {
    System.out.println("Main thread");
    }
 
  
  }
}