class Demo
{
 public static void main(String... args)
 {
  
  try
  {
   System.out.println("Outer try ");
   int a=10/0;
   
    try
    {
     System.out.println("Inner try ");
     int b=10/0;
     }
    catch(ArithmeticException ae)
    {
      System.out.println("Inner catch ");
     }
    finally
    {
     System.out.println("Inner finally end ");
     }
   System.out.println("Outer try end ");
   }   

  catch(ArithmeticException ae)
  {
   System.out.println("Outer catch ");
   }
  finally
  {
   System.out.println("Outer finally end ");
   }
  System.out.println("Program end ");
  }
}

// Do variation in this program and understand the flow of program