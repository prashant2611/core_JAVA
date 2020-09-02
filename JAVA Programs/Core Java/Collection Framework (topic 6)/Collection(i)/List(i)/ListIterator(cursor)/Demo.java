import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  LinkedList ll=new LinkedList();
  ll.add("Prashant");
  ll.add("Dinanath");
  ll.add("Rahul");
  ll.add("Simran");
  System.out.println(ll); 
 
  ListIterator li=ll.listIterator();
  while(li.hasNext())
  {
   String s=(String)li.next();
   System.out.println(s);
   if(s.equals("Prashant"))
    li.remove();
   else if(s.equals("Dinanath"))
    li.add("Hello");
   else if(s.equals("Rahul"))
    li.set("Rahul sir");
   }
  System.out.println(ll);

  }
}