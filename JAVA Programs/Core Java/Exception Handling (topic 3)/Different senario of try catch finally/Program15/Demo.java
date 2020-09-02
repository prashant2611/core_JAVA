class Demo
{
 public static void main(String... args)
 {
   try
   {
     try
     {
     int a=10/0;
     }
     finally
     {
       System.out.println("Finally");
      }
    }
   catch(ArithmeticException ae)
    {
     System.out.println("Arithmetic Exception");
     }
  }
}