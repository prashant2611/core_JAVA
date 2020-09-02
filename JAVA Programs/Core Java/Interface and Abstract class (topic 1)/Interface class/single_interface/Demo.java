interface Test
{
  //int j;  // interface class veriables are static ,public and final.
  int i=11;
  void fun();
  void gun();
}

class Demo implements Test
{
   public void fun()  // interface methods are public so we have to declare here public otherwise it generates an error.
    {
       System.out.println(" fun method ");
     }
   public void gun()  // same for this method.
    {
       System.out.println(" gun method ");  
     }

   public static void main(String... args)
   {
     //Test obj=new Test();  // we cannot create object of interface class. 
     Test tobj=new Demo();   // for access methods of interface class we have do upcasting for that. 
     Demo dobj=new Demo(); 
     //Test.i++;             // interface variables are final so we cannot modify it.
     System.out.println(Test.i);   // because i is static in interface class so we can call directly from here. because Demo class implements interface class
     //Demo.fun();
     tobj.fun();    // methods are not static so we cannot call methods directly.
     dobj.fun();
    } 
}