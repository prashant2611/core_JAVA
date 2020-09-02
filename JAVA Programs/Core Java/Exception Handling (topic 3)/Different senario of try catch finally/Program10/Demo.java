class Demo
{
 public static void main(String... args)
 {
   try                               // error: 'try' without 'catch', 'finally' or resource declarations
   {
     int a=10/0;
     }
   System.out.println("Hello");
   catch(ArithmeticException ae)
    {
     System.out.println("Arithmetic Exception");
     }
  }
}