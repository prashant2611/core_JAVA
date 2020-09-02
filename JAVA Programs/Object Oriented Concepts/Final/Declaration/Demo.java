class Demo
{
  final int i=10,j,k; // We can declare final variable at the time of initiallization or we can initiallize inside the constructor or in block.
   Demo()
   {
     j=20;
    }
 
   {
     k=30;
    }

 public static void main(String[] args)
  { 
    Demo dobj=new Demo();
    System.out.println(dobj.i);
    System.out.println(dobj.j);
    System.out.println(dobj.k);

   }
}