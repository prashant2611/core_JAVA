class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   catch(ArithmeticException ae)
    {
     System.out.println("Arithmetic Exception");
     }
   finally
    {
      System.out.println("Finally1"); 
      }
   /*finally                                 Error(C): Finally without try
     {
      System.out.println("Finally2");
      }
    */
  }
}