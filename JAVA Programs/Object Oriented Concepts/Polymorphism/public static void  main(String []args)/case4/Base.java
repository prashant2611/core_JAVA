class Base   // when we call Base class then we will occure error of main not found.
{

}

class Derived extends Base
{
  public static void main(String[] args)
  {
    System.out.println("Derived main");
   }
}