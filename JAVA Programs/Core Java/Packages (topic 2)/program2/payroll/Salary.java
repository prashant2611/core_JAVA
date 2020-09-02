package payroll;

public class Salary
{
  double net,total,allowance,bonus,hra,tax;  
 
  public double calNet(double sal)
  {
    allowance=sal*.4;
    bonus=sal*.3;
    hra=sal*.2;
    total=sal+allowance+bonus+hra;
    tax=total*.1;
    net=total-tax;
    return net;       
   }
}