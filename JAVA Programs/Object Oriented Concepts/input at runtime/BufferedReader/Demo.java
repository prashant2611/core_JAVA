import java.io.*;

class Demo
{
 public static void main(String[] args) throws IOException
 {
    String name;
    double marks;
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter name of student: ");
    name=br.readLine();
    System.out.println("Enter marks of student: ");
    marks=Double.parseDouble(br.readLine());

    if(marks >= 40)
     System.out.println("Hey "+name+" You passed your exam :)");
    else
     System.out.println("Do well at next time "+name);
  }
}