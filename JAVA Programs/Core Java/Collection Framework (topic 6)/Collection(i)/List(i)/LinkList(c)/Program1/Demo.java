import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  LinkedList ll=new LinkedList();
  
  ll.add("Prashant");
  ll.add(10);
  ll.add(null);
  ll.add("Prashant");
  ll.add(3.14);
  ll.set(0,"Java");
  System.out.println(ll);

  ll.removeFirst();
  System.out.println(ll);
  }
}