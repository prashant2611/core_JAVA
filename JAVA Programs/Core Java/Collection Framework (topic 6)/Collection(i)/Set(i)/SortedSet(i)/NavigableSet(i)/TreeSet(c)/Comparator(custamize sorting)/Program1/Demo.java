import java.util.*;

class Demo
{
 public static void main(String... args)
 {
   TreeSet ts=new TreeSet(new Test());
   ts.add(4);
   ts.add(5);
   ts.add(2);
   ts.add(6);
   ts.add(1);
   System.out.println(ts);
  }
}

class Test implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
   Integer i1=(Integer)obj1;
   Integer i2=(Integer)obj2;

   if(i1<i2)
    return +1;
   if(i1>i2)
    return -1;
   else 
    return 0;
   }
}