class Demo
{
 public static void main(String... args)
 {
  StringBuffer sb=new StringBuffer();                // empty string (capacity 16 for mutable)
  StringBuffer sb1=new StringBuffer("Hello");        // capacity 16+5=21
  System.out.println(sb);
  System.out.println(sb1);
  }
}