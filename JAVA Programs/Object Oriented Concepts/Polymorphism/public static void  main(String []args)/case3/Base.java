class Base     //when we call Base class output will be Base main
{
  public static void main(String[] args)  
  {
    System.out.println("Base main");  
   }
}

class Derived extends Base   // when we call Derived class output will be Derived main
{
  public static void main(String[] args)
  {
    System.out.println("Derived main");
   }  
}