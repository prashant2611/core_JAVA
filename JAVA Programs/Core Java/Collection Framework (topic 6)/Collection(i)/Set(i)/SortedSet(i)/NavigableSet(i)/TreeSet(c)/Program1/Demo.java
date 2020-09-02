import java.util.*;

class Demo
{
 public static void main(String args[])
 {
  TreeSet ts=new TreeSet();
  ts.add("B");
  ts.add("A");
  ts.add("D");
  ts.add("C");
  ts.add("E");
  System.out.println(ts);

  Iterator it=ts.iterator();
  while(it.hasNext())
  {
    String s=(String)it.next();
    System.out.println(s);
   }
  }
}