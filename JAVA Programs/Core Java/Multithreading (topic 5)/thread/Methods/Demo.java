class Test extends Thread
{
  public void run()
  {
    System.out.println(currentThread());             // To check current thread
    System.out.println(isAlive());
    System.out.println(getName());

   }
 
}

class Demo
{
 public static void main(String... args)
 {
  Test t1obj=new Test();
  Test t2obj=new Test();  
  Test t3obj=new Test();
  t1obj.setName("1st");
  t1obj.start();
  t2obj.start();
  t3obj.start();
 }
}