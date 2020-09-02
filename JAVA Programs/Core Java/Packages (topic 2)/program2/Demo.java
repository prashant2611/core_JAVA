import payroll.Salary;

class Demo
{
  public static void main(String... args)
  {
    double net,sal;
    
   
    Salary sobj=new Salary();
    sal=Double.parseDouble(args[0]);
    net=sobj.calNet(sal);
    System.out.println("Net salary of given basic salary is "+net);
   }
}