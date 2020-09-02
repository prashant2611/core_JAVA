class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   catch(NumberFormatException ae)
    {
     System.out.println("Arithmetic Exception");
     }
   finally                                             // This will be execute 
    {
    System.out.println("Finally");
     }
  }
}