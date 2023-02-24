class CmdArgs
{
 public static void main(String [] args )
  {
   System.out.println("\nString is "+args[0]);
  }
}
class CmdArgs1
{
 public static void main(String [] args )
  {
   System.out.println("\nString is "+args[0]);
   System.out.println("\nString is "+args[1]);
   System.out.println("\nString is "+args[2]);
   System.out.println("\nString is "+args[3]);
  }
}
class CmdArgs2
{
 public static void main(String [] args )
  {
   for(int i =0 ; i<args.length;i++)
    {
	 System.out.println(args[i]);
	}
   }
}
class  CmdArgs3
{ 
 public static void main(String [] args)
 {
	 int s;
	 s=args[0]+args[1];
	 System.out.println("sum:"+s);
 }
}
class  CmdArgs4
{ 
 public static void main(String [] args)
 {
	 int a,b,s;
	 a=Integer.parseInt(args[0]);
	 b=Integer.parseInt(args[1]);
	 s=a+b;
	 System.out.println("Sum :"+s);
 }
}
	 
	 

	