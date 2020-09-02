class Const
{
 Const()
  {
    System.out.println("Const Constructor ");
   }
 }

class Construct
{
 Construct(int i)
 {
  System.out.println("Parameterize constructor and value given is "+i);
  }
}

class Demo
{
 public static void main(String args[])
 {
  Const cobj= new Const();
  Construct cnobj=new Construct(5);
  System.out.println("Main method");
  }

}