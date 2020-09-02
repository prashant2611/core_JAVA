class Base
{
  double net;
  Base()
   {
     System.out.println("Welcome to Overloading");
     net=0;  // we dont need to initiallize 0 here because in JAVA there is available GC for that //but for only formality we initiallize.
    }
 
  void calcNet(String name, double amount)
   {
      net=amount;
      System.out.println(name+" your net bill is "+net); 
    }
  
  void calcNet(String name,double amount,double discount)
   {
     net=amount-discount;
     System.out.println(name+" your net bill is "+net);
   }
}

class Demo
{
 public static void main(String[] args)
 {
     Base bobj=new Base();
     bobj.calcNet("Prashant",8000);
     bobj.calcNet("Prashant",8000,2000);      
  }
}

/* Output:
Welcome to Overloading
Prashant your net bill is 8000.0
Prashant your net bill is 6000.0
*/