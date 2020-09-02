import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  Vector v=new Vector();
  for(int i=1;i<=10;i++)
  {
    v.addElement(i);
   }
   System.out.println(v.capacity());
   v.add(20);
   System.out.println(v.capacity());
  }
}