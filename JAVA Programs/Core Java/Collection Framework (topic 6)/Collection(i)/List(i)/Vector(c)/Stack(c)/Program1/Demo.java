import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  Stack s=new Stack();
  System.out.println(s.capacity());

  s.push(3);
  s.add(55);
  s.push("Hello");
  s.push(3.13);
  System.out.println(s);
  System.out.println(s.pop());
  System.out.println(s.peek());
  System.out.println(s);
  System.out.println(s.empty());
  }
}