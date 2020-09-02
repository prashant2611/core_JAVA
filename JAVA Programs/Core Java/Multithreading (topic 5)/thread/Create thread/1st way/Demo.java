class Test extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)
    {
      System.out.println("Child Thread");
     }
   }
}

class Demo
{
 public static void main(String... args)
 {
  Test tobj=new Test();
  tobj.start();

     for(int i=0;i<10;i++)
    {
      System.out.println("Main thread");
     }
  
  }
}


/*
output:
Main thread
Main thread
Main thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
Main thread
*/