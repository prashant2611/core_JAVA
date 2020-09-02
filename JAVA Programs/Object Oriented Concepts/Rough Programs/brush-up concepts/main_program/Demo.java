import banking.Calculator;

class Demo
{
  public static void main(String... args)
  {
   Calculator cobj=new Calculator();
   int x,y;
   x=Integer.parseInt(args[0]);
   y=Integer.parseInt(args[1]);
   System.out.println("Addition of given two number is: "+cobj.add(x,y));
   System.out.println("Square of given first number is: "+cobj.sq(x));
   System.out.println("Square of given Second number is: "+cobj.sq(y));
   }
}