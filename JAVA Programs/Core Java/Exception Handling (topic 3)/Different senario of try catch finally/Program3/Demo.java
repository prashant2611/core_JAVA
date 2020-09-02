class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   catch(Exception e)
    {
      System.out.println(e);
      e.printStackTrace();
     }
   /*catch(ArithmeticException ae)                                           if we include it in the program then we will get an error i.e. Exception ArithmeticException has already caught
    {                                                                        because we use Exception before the ArithmeticException ( Exception is the parrent class of compile time exception
     System.out.println("Arithmetic Exception");                             and run time exception.)
     }
    */
  }
}