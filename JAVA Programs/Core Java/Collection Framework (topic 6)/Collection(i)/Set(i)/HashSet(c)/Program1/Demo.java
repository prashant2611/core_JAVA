import java.util.*;

class Demo
{
 public static void main(String... args)
 {
   HashSet hs=new HashSet();
   System.out.println(hs.add("Prashant"));
   hs.add(4);
   hs.add(3.14);
   hs.add(null);
   System.out.println(hs.add("Prashant"));
   System.out.println(hs);
  }
}