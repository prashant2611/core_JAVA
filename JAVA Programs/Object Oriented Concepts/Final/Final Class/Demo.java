final class Base
{

}

class Derived extends Base //error,Cannot inherit the final class.
{

}

class Demo
{
  public static void main(String[] args)
  {
   Derived dobj=new Derived();   
   }


}