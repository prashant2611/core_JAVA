class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   catch(ArithmeticException ae)                               //error: {} expected
     System.out.println("Arithmetic Exception");
     
  }
}