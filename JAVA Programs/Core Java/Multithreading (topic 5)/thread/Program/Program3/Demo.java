class Test1 extends Thread
{
  String msg;
  Test2 t2=new Test2();
  Test1(String s, Test2 t)
  {
   msg=s;
   t2=t;
   }


 public void run()
 {
   t2.display(msg);
  }
}

class Test2
{
  synchronized void display(String msg)
  {
   System.out.println("Hello");
   System.out.println("[");
   System.out.println(msg); 
   System.out.println("]");
  
   
   
   }
}

class Demo
{
 public static void main(String... args)
 {
   Test2 tobj2=new Test2();
   
   Test1 t1obj=new Test1("java",tobj2);
   Test1 t2obj=new Test1("class",tobj2);
 
   t1obj.start();
   t2obj.start();
  }
}