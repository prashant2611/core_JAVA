class Demo
{
 public static void main(String... args)
 {
  StringBuffer sb1=new StringBuffer();
  System.out.println(sb1.capacity());                  //1) capacity is to check the remaining size for mutation
  
  StringBuffer sb2=new StringBuffer(20);
  System.out.println(sb2.capacity());                  //  we change initial capacity 16 to 20
  
  StringBuffer sb3=new StringBuffer("Hello World");
  System.out.println(sb3.capacity());                  //  capacity for string is 16+11=27
  
  StringBuffer sb4=new StringBuffer("Infrmation");
  System.out.println(sb4.insert(3,"o"));               //2) insert char at perticular index

  System.out.println(sb4.reverse());                   //3) reverse the string
  
  System.out.println(sb4.reverse()); 
  System.out.println(sb4.deleteCharAt(3));             //4) delete char at perticular index
 
  System.out.println(sb4.replace(4,6,"ok"));           //5) replace the string

   System.out.println(sb4.append("Hello"));            //6)Append string 
}
}