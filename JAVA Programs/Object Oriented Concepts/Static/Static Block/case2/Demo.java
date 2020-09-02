class Demo
{
 static
  {
    System.out.println("Static block");
    System.exit(0);                     //Program terminated here
   }
 
public static void main(String[] args)
 {
   System.out.println("Main function");   // It will be not going to print because When Class loads into the JVM at the time of that Static block intillization also happned and in static block we termineted program so our program never come in main().  
  }

}

//output: Static block