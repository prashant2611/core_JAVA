class Demo
{
 public static void main(String... args)
 {
   try                                                    //error: {} expected
     int a=10/0;
   catch(ArithmeticException ae)
    {
     System.out.println("Arithmetic Exception");
     }
  }
}