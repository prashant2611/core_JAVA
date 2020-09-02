import java.util.*;

class Demo
{
 public static void main(String... args)
 {
    Scanner sc=new Scanner(System.in);
    int a,b=0;
  
    try
    {
      System.out.println("Enter the value for a: ");
      a=sc.nextInt();
      b=10/a;
      System.out.println("output: "+b);
     }
      
    catch(ArithmeticException ae)
    {
       System.out.println("Enter non zero value.");
     }
    
    catch(InputMismatchException im)
    {
       System.out.println("Enter integer value.");
     }
    
    catch(Exception e)
    {
      System.out.println(e);
     }
  }
}
