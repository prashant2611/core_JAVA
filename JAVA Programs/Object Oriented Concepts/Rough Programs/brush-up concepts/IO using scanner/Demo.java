import java.util.*;

class Demo
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   String name;
   int marks;
   
   System.out.println("Enter name: ");
   name=sc.next();
   System.out.println("Enter marks: ");
   marks=sc.nextInt();

   if(marks>=40)
     System.out.println(name+" Pass");
   else
     System.out.println(name+ " Fail");
  }
}