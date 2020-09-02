import java.io.*;

class Demo
{
 public static void main(String... args) throws IOException
 {
    InputStreamReader ip =new InputStreamReader(System.in);
    BufferedReader op=new BufferedReader(ip);
    
    String name;
    int marks;

    System.out.println("Enter the name of student: ");
    name=op.readLine();
    System.out.println("Enter the marks of student: ");
    marks= Integer.parseInt(op.readLine());

    if(marks>=40)
      System.out.println("Congratulation "+name+" Pass");
    else 
      System.out.println("Fail");
  }
}