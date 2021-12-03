// program to check command line arguments
public class Quest {
 public static void main(String[] args) {
  if(args.length>0)
  {
   System.out.println(args[0]);
   System.out.println(args[1]);
  }
  else{
   System.out.println("no values");
  }
 }
}
