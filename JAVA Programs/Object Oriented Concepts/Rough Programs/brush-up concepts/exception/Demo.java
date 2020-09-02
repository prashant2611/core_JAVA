class Demo
{
 public static void main(String... args)
 {
  int a,b;
  
  try
   {
    a=Integer.parseInt(args[0]);
    b=10/a;
    }
  catch(ArithmeticException ae)
    {
      System.out.println("Arithmetic Exception");
     }
     catch(ArrayIndexOutOfBoundsException ar)
    {
      System.out.println("ArrayIndexOutOfBoundsException");
     }
   
    
   
  }
}
