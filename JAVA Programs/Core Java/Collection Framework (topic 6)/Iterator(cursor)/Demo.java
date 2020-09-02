import java.util.*;

class Demo
{
 public static void main(String... args)
 {
  ArrayList al=new ArrayList();
  for(int i=0;i<10;i++)
  {
   al.add(i);
   }
  
  Iterator it=al.iterator();
  while(it.hasNext())
  {
    Integer i=(Integer)it.next();
    System.out.println(i);
    if(i%2==0)
     {
      it.remove();
      }
    
   }
   System.out.println(al);
  }
}