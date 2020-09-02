import java.util.*;
import java.io.*;

class Demo
{
 public static void main(String... args)
 {
  ArrayList al=new ArrayList();
  LinkedList ll=new LinkedList();
  Vector v=new Vector();

  System.out.println(al instanceof Serializable);
  System.out.println(ll instanceof Serializable);
  System.out.println(v instanceof Serializable);

  System.out.println(al instanceof Cloneable);
  System.out.println(ll instanceof Cloneable);
  System.out.println(v instanceof  Cloneable);

  System.out.println(al instanceof RandomAccess);
  System.out.println(ll instanceof RandomAccess);
  System.out.println(v instanceof  RandomAccess);
  }
}