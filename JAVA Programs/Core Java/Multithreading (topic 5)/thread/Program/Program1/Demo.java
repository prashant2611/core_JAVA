class Test extends Thread
{
 int first,end;
 Test(int x,int y)
  {
    first=x;
    end=y;
   }

 void display()
  {
   for(int i=first;i<end;i=i+2)
    {
      System.out.println(i);
      }
   }

  public void run()
   {
     display();
    }
}

class Demo
{
 public static void main(String... args)
 {
   Test tobj1=new Test(1,100);
   Test tobj2=new Test(2,100);
   tobj1.start();
   tobj2.start();

  tobj1.setPriority(3);
  tobj2.setPriority(10); 
  }
}
