class Demo
{
 public static void main(int []args) // We can overload main function but JVM call first String main and then we have to call other main functions explicitly
  {
    System.out.println("int main");
   }
 public static void main(String []args)
  {
   System.out.println("String main");
   int i[]={5,4};
   main(i);    // to call int main function , it is mandetory to create array of that type and then pass that array into function.

   }

}