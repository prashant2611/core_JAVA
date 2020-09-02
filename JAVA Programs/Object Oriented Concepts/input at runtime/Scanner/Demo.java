import java.util.*;

class Demo
{
  public static void main(String... args)
  {
     double mks;
     String name;
     Scanner scr=new Scanner(System.in);
     System.out.println("Enter name off Student: ");
     name=scr.next();
     System.out.println("Enter marks of Student: ");
     mks=scr.nextInt();
   
     if(mks>=40)
      {
        System.out.println("Hey "+name+"! You passed your exam.");
       }
     else
      {
        System.out.println("Sorry "+name+"! You are fail.");
       }
   }
}