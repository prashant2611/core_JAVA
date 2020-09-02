import banking.Calculator;

class Demo
{
  public static void main(String... args)
  {
      int res=0,no1,no2;
      Calculator cobj=new Calculator();
      
      no1=Integer.parseInt(args[0]);
      no2=Integer.parseInt(args[1]);
      res=cobj.add(no1,no2);
      System.out.println("Addition of given numbers is "+res);     
      res=cobj.square(no1);
      System.out.println("Square of first number is "+res);     
   }
 
}