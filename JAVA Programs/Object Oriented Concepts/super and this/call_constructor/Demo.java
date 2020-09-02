class Base
{
 Base(float f)
 {
   System.out.println("Base Default Constructor");
  }
}

class Derived extends Base
{
 Derived()   //Default Constructor
   {
      this(9);
      System.out.println("Default Constructor");
    }
  
  Derived(int i)  //Parameterized Constructor
  {
      this("Prashant");
      System.out.println("Parameterized int Constructor");   
   }

  Derived(String s)   //Parameterized Constructor
   {
    // this(3.14f);      // we cant call constructor of parent class using "this" , for that we have to use "super" but we can call methods of parent class using "this".
       super(3.14f);  // 3.14f is for give the float value, suppose we write 3.14 then it consider double value.
     System.out.println("Parameterized String Constructor");
    } 
}


class Demo
{
   public static void main(String[] args)
   {
     Derived bobj=new Derived();

    }

}


/* Output:  Base Default Constructor
            Parameterized String Constructor
	    Parameterized int Constructor
	    Default Constructor
*/