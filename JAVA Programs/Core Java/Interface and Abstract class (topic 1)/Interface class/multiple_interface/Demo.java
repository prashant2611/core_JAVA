interface Test
{
    void fun();
}

interface Test1
{
   void gun();
}

class Demo implements Test,Test1
{
    public void fun()
     { 
       System.out.println(" Interface Test "); 
      }
    public void gun()
     {
       System.out.println(" Interface Test1 ");
      }

   

 public static void main(String... args)
 {
   Demo dobj=new Demo();
   dobj.fun();
   dobj.gun();    
  }
}