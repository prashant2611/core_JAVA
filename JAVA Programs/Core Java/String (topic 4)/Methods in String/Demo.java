class Demo
{
 public static void main(String... args)
 {
  String s1="Hello";
  String s2="World";

  System.out.println(s1.length());             //1) for length

  System.out.println(s1.concat(s2));           //2) concatination
   String s3=s1+s2;
  System.out.println(s3);
 
  String s4="India is my country.";
  System.out.println(s4.charAt(4));            //3) find char at specified position (Note:StringIndexOutOfBounce Exception occure if number is negative or greater then the size of String.)

  System.out.println(s4.indexOf("i"));         //4) find the index of specific char
  System.out.println(s4.indexOf("i",4));
  System.out.println(s4.indexOf("i",10));      // output: -1 because after 10th index there is no char i available so it will give the output as -1.
  
  System.out.println(s4.lastIndexOf("n"));     //5) find the last occurance of char 
  System.out.println(s4.lastIndexOf("n",0));   // output: -1

  System.out.println(s4.startsWith("Ind"));     //6) check the string starts with specified set of char (Output in the form of boolean value.)
  System.out.println(s4.startsWith("is"));

  System.out.println(s4.endsWith("ry."));        //7) check the string ends with specified set of char 
  System.out.println(s4.endsWith("India"));

  System.out.println(s4.toUpperCase());          //8) change the case of String
  System.out.println(s4.toLowerCase());

  System.out.println(s4.substring(4));           //9) display the part of string  (output: a is my country.)
  System.out.println(s4.substring(7));

  System.out.println(s1.equals(s2));              //10) check weater content of string are equal or not.
  String s5="hello";
  System.out.println(s1.equalsIgnoreCase(s5));    // ignore the case  (output: true)

  String s6="H";
  System.out.println(s1.compareTo(s2));           //11) compair(ascii) the content of string                
  System.out.println(s1.compareTo(s6));

  String s7="   Hey         ";
  System.out.println(s7.trim());                  //12) remove white spaces at the start of strim and end of strim.
}
}