class Demo
{
  int i;
  static int j;
  Demo()
  {
    i=10;
    j=20;   // We can declare static and final veriable at the time of declaration or in constructor or in block
   }
  
   void gun()
   {
     System.out.println(i);
     System.out.println(j); //We can use static method or variable of class in non static method.

    }
  
  static void fun()
  {
   // System.out.println(i);  //error because static method can access only static variable or methods of class.
    System.out.println(j);
    }

 public static void main(String[] args)
 {
  Demo dobj=new Demo();
  System.out.println(Demo.j);
  Demo.fun();  //we can call static method or variable through its class name.
  dobj.gun(); // we cannot call unstatic method or class using its class name, we have to create object of that class to call the function.
  }
}