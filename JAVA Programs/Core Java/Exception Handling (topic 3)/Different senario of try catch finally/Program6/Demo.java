class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   finally 
   {
       System.out.println("Finally");
    }
   catch(ArithmeticException ae)                                 // Gives compile time error (catch without try) because we do not write catch below the try. 
    {
     System.out.println("Arithmetic Exception");
     }
  }
}