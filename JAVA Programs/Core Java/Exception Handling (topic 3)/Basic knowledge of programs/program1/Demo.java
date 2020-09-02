class Demo
{
 public static void main(String[] args) // input: prashant ppkacsij    output:NumberFormatException       and input: Prashant 40  output:allowed
 {
    String name;
    double mks;
    name=args[0];
    mks=Integer.parseInt(args[1]);
    if(mks>=40)
     {
         System.out.println("Congratulations "+name+" you passed exam.");
      }
    else
     {
        System.out.println("Sorry! you are fail.");
      }  
  }
}