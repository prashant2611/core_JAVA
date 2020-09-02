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
   catch(Exception e)
    {
     System.out.println("There is something wrong in program and that is "+e);
     }
  }
}