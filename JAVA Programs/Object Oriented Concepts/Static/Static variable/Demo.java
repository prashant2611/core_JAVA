class Base
{
  static int i;
  Base()
  {
    i=10;
   }
}

class Demo
{
 public static void main(String[] args)
 {
  Base bobj=new Base();
  Base b1obj=new Base();
  bobj.i=11;
  System.out.println(bobj.i);
  System.out.println(b1obj.i); //Reflect change of bobj here because of static 
  }

}