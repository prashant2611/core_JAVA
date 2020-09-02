import java.util.*;

class Demo
{
 public static void main(String... args)
 {
   LinkedHashSet lhs=new LinkedHashSet();
   System.out.println(lhs.add("Prashant"));
   lhs.add(3);
   lhs.add(3.14);
   lhs.add(null);
   System.out.println(lhs.add("Prashant"));
   System.out.println(lhs);
  }
}