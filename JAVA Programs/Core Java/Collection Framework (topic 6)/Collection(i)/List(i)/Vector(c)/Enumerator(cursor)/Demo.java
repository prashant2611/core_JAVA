import java.util.*;

class Demo
{
 public static void main(String... args)
 {
   Vector v=new Vector();
  // Vector v2=new Vector();
 
   for(int i=0;i<10;i++)
   {
      v.addElement(i);         
     }   
   v.add("Hello");      // it will give exception when we use cursor bcz String cannot converted into Integer
   System.out.println(v);

 Enumeration e=v.elements();
 while(e.hasMoreElements())
 {
  // v2=e.nextElement();                          We cannot convert object into Vector and other datatype.So, we have to use Integer,etc class for that to initialize object to object.
   
  Integer i=(Integer)e.nextElement();
  System.out.println(i); 
  }
 
        
 }
}