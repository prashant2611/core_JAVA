class Demo
{
 public static void main(String... args)
 {
   try
   {
     int a=10/0;
     }
   finally                               //error: {} expected
     System.out.println("Finally");
     
  }
}