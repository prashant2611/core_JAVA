import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  ArrayList<Integer> al=new ArrayList<Integer>();     
  al.add(10);
  /*al.add(2.10);                                 
  al.add("Hello");
  al.add(null);
  */
  al.add(40);
  al.add(10);
  
  System.out.println(al);
  al.remove(1);                             
  System.out.println(al);
  }
}